package Leetcode;

import java.util.*;

public class ThreeSumClosest {
    static ThreeSumClosest classObject = new ThreeSumClosest();
    public int threeSumClosest(int[] nums, int target) {
        int fin = Integer.MAX_VALUE;

        // Sorting the Array:
        Arrays.sort(nums);

        // Two Pointer Approach:
        for (int targetIndex = 0; targetIndex < nums.length - 1; targetIndex++) {
            // "start" Pointer starts from targetIndex + 1, "end" remains same as nums.length - 1
            int start = targetIndex + 1;
            int end = nums.length - 1;

            // Two Pointer Loop:
            while (start < end) {
                int sum = nums[targetIndex] + nums[start] + nums[end];
                if (sum == target) {
                    return target;
                } else if (Math.abs(sum - target) < Math.abs(fin - target)) {
                    fin = sum;
                }

                // Update the Pointers:
                if (sum <= target) {
                    start++;
                    // Testing
                    while (nums[start] == nums[start - 1] && start != end) {
                        start++;
                    }
                } else {
                    end--;
                }
            }
        }
        return fin;
    }

    public static void main(String[] args) {
//        nums = [-4, -1, 1, 2], target = 1
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        // Sorting the nums Array:
        Arrays.sort(nums);

        System.out.println(classObject.threeSumClosest(nums, target));
    }
}
