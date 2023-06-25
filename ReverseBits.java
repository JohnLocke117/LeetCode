package Leetcode;

public class ReverseBits {
    static ReverseBits classObject = new ReverseBits();
    public int reverseBits(int n) {
        int x = 0;
        int i = 31;

        while (i >= 0) {
            // Extract the ith Bit and move to the right (31 - ith) position:
            int temp = (n >> i) & 1;
            temp = temp << (31 - i);
            x = x | temp;
            i--;
        }
        return x;
    }

    public static void main(String[] args) {
        int n = Integer.getInteger("00000010100101000001111010011100");
        System.out.println(n);
    }
}
