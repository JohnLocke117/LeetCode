package Leetcode;

public class SqrtX {
    static SqrtX classObject = new SqrtX();
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        // By Binary Search:
        // Search in Numbers between 1 - x:
        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int x = 40;
        System.out.println(classObject.mySqrt(x));
    }
}
