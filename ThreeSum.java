package Leetcode;

import java.util.*;

public class ThreeSum {
    static ThreeSum classObject = new ThreeSum();
    public List<List<Integer>> threeSum(int[] nums) {
        // Create a List of List to store final Answer:
        List<List<Integer>> finAns = new ArrayList<>();

        // Create a Set to store unique Triplets:
        Set<List<Integer>> tempSet = new HashSet<>();

        // Sorting the Array:
        Arrays.sort(nums);

        // Two Pointer Approach:
        for (int targetIndex = 0; targetIndex < nums.length; targetIndex++) {
            // "start" Pointer starts from targetIndex + 1, "end" remains same as nums.length - 1
            int start = targetIndex + 1;
            int end = nums.length - 1;

            // Two Pointer Loop:
            while (start < end) {
                if (nums[targetIndex] + nums[start] + nums[end] == 0) {
//                    //Testing:
//                    System.out.println("Testing: ");
//                    System.out.println(Arrays.asList(nums[targetIndex], nums[start], nums[end]));

                    tempSet.add(Arrays.asList(nums[targetIndex], nums[start], nums[end]));
                    start++;
                    end--;
                } else if (nums[targetIndex] + nums[start] + nums[end] < 0) {
                    start++;
                } else if (nums[targetIndex] + nums[start] + nums[end] > 0) {
                    end--;
                }
            }
        }
        finAns.addAll(tempSet);
        return finAns;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(classObject.threeSum(nums));
    }
}