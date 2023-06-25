package Leetcode;

import java.awt.event.ItemEvent;

public class NumberOfOneBits {
    static NumberOfOneBits classObject = new NumberOfOneBits();
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = -3;
        System.out.println(classObject.hammingWeight(n));
    }
}
