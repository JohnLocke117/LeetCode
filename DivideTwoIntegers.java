package Leetcode;

public class DivideTwoIntegers {
    static DivideTwoIntegers classObject = new DivideTwoIntegers();
    public int divide(int dividend, int divisor) {
        // Check for MAX_VALUE:
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Check for Sign:
        boolean isNegative = (dividend >= 0) == (divisor >= 0);
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        // Perform Division:
        // Double the Divisor and Check if it is smaller than Dividend. If it
        // becomes larger, do (Dividend - (last smaller) Divisor) = Remainder
        // Perform same doubling operation on Remainder until a value is found
        // which cannot be subtracted.
        int quotient = 0;
        while (dividend - divisor >= 0) {
            int count = 0;

            while (dividend - (divisor << 1 << count) >= 0) {
                count++;
            }
            quotient += 1 << count;
            dividend -= divisor << count;
        }

        return isNegative ? quotient : -quotient;
    }

    public static void main(String[] args) {
        int dividend = -2147483648;
        int divisor = 2;
        System.out.println(classObject.divide(dividend, divisor));
    }
}
