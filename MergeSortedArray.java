package Leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    static MergeSortedArray classObject = new MergeSortedArray();
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);

        return nums1;
    }

    public static void main(String[] args) {
        // nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        System.out.println(Arrays.toString(classObject.merge(nums1, m, nums2, n)));
    }
}
