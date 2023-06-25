package Leetcode;

import java.util.Stack;

public class RemovingStarsFromAString {
    public String removeStars(String s) {
        // Create a Stack:
        Stack<Character> s_stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                s_stack.push(s.charAt(i));
            } else {
                s_stack.pop();
            }
        }
        StringBuilder s_final = new StringBuilder();
        while (!s_stack.isEmpty()) {
            char temp = s_stack.pop();
            s_final.append(temp);
        }
        return s_final.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "leet**cod*e";

        RemovingStarsFromAString class_object = new RemovingStarsFromAString();
        System.out.println(class_object.removeStars(s));
    }
}
