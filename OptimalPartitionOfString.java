package Leetcode;

import java.util.*;

public class OptimalPartitionOfString {
    public int partitionString(String s) {
        Set<Character> stringSet = new HashSet<>();
        int subStringCount = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = stringSet.toArray().length;
            stringSet.add(s.charAt(i));
            int len2 = stringSet.toArray().length;

            System.out.println("Before => " + stringSet);
            if (len1 == len2) {
                subStringCount++;
                stringSet.removeAll(stringSet);
                System.out.println("After => " + stringSet);
                System.out.println("Sub-String Count => " + subStringCount);
                i--;
            }
        }
        return subStringCount + 1;
    }

    public static void main(String[] args) {
        String s = "ssssss";

        OptimalPartitionOfString class_object = new OptimalPartitionOfString();
        System.out.println(class_object.partitionString(s));
    }
}
