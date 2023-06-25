package Leetcode;

import java.util.Arrays;

public class MinimizeMaximumOfArray {
    public boolean valid(int mid, int[] nums) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > (long) mid * (i + 1)) {
                return false;
            }
        }
        return true;
    }
    public int minimizeArrayValue(int[] nums) {
        int left = 0;
        int right = Arrays.stream(nums).max().getAsInt();
        int fin_ans = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (valid(mid, nums)) {
                fin_ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return fin_ans;
    }

    public static void main(String[] args) {
        int[] nums = {3, 7, 1, 6};

        MinimizeMaximumOfArray class_object = new MinimizeMaximumOfArray();
        System.out.println(class_object.minimizeArrayValue(nums));
    }
}
