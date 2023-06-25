package Leetcode;

import java.util.Arrays;

public class TwoSum {
    static TwoSum classObject = new TwoSum();
    public int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[start] + nums[end] == target) {
                return new int[] {start, end};
            } else if (nums[start] + nums[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        System.out.println(Arrays.toString(classObject.twoSum(nums, target)));
    }
}
