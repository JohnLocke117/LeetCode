package Leetcode;

public class PowerOfThree {
    static PowerOfThree classObject = new PowerOfThree();
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        }
        return n % 3 == 0 && isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        int n = 81;
        System.out.println(classObject.isPowerOfThree(n));
    }
}
