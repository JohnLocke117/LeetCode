package Leetcode;

import java.util.Arrays;

public class NextPermutation {
    static NextPermutation classObject = new NextPermutation();
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length-1;
        while(i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public int[] nextPermutation(int[] nums) {
        // Find last Sorted Element:
        int k = -1;
        int I = -1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k = i;
                break;
            }
        }

        if (k == -1) {
            reverse(nums, 0);
            return nums;
        }
        else {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[j] > nums[k]) {
                    I = j;
                    break;
                }
            }

            // Swap nums[k] and nums[I]:
            swap(nums, k, I);

            // Reverse the array from nums[k + 1] to nums[nums.length - 1]:
            reverse(nums, k + 1);
        }

        return nums;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 2, 1};
//        int[] nums = {2, 1, 3};
        int[] nums = {1, 2};
        System.out.println(Arrays.toString(classObject.nextPermutation(nums)));
    }
}