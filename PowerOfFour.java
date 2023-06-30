package Leetcode;

public class PowerOfFour {
    static PowerOfFour classObject = new PowerOfFour();
    public boolean isPowerOfFour(int n) {
        // (n - 1) is a multiple of 3:
        // n & (n - 1) == 0 for multiples of 2:
        return (n & (n - 1)) == 0 && ((n - 1) % 3 == 0);
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(classObject.isPowerOfFour(n));
    }
}
