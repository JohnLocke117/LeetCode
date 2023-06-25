package Leetcode;

import java.util.Arrays;

public class TwoSumII {
    static TwoSumII classObject = new TwoSumII();
    public int[] twoSum(int[] numbers, int target) {
        // Two Pointer Approach.
        // numbers[] array is already sorted.
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            if (numbers[start] + numbers[end] == target) {
                return new int[] {start + 1, end + 1};
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            }
            else {
                end--;
            }
        }

        return new int[] {-1, -1};
    }

    public static void main(String[] args) {
        int[] numbers = {-1, 0};
        int target = -1;

        System.out.println(Arrays.toString(classObject.twoSum(numbers, target)));
    }
}
