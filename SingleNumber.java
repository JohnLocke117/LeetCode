package Leetcode;

public class SingleNumber {
    static SingleNumber classObject = new SingleNumber();
    public int singleNumber(int[] nums) {
        // Using XOR:
        int finAns = 0;
        for (int i : nums) {
            finAns = finAns ^ i;
        }
        return finAns;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(classObject.singleNumber(nums));
    }
}
