package Leetcode;

public class MissingNumber {
    static MissingNumber classObject = new MissingNumber();
    public int missingNumber(int[] nums) {
        // XOR all numbers from the Array with all numbers from range (0-n):
        // All numbers XOR twice and get to 0, only the missing number gets XORed once
        // Hence it remains.
        int result = nums.length;
        for (int i = 0; i< nums.length; i++) {
            result ^= i ^ nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(classObject.missingNumber(nums));
    }
}
