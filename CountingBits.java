package Leetcode;

import java.util.Arrays;

public class CountingBits {
    static CountingBits classObject = new CountingBits();
    public int[] countBits(int n) {
        int[] finArray = new int[n + 1];
        finArray[0] = 0;
        for (int num = 1; num <= n; num++) {
            // Number is num:
            int tempCount = 0;
            for (int j = 0; j < Integer.toBinaryString(num).length(); j++) {
                if ((Integer.toBinaryString(num).charAt(j) & 1) == 1) {
                    tempCount++;
                }
            }
            finArray[num] = tempCount;
        }

        return finArray;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println(Arrays.toString(classObject.countBits(n)));
    }
}
