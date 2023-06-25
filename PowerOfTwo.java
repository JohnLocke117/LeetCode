package Leetcode;

public class PowerOfTwo {
    static PowerOfTwo classObject = new PowerOfTwo();
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 32;
        System.out.println(classObject.isPowerOfTwo(n));
    }
}
