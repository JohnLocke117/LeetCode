package Leetcode;

public class FibonacciNumber {
    static FibonacciNumber classObject = new FibonacciNumber();
    public int fib(int n) {
        // Base Condition:
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        // Recursive Call:
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(classObject.fib(n));
    }
}
