package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        } else if (head.next == null) {
            return true;
        }
        ArrayList<Integer> listValues = new ArrayList<>();
        while (head != null) {
            listValues.add(head.val);
            head = head.next;
        }
        // listValues now holds all the Values of the LL:
        // Create two Sub-Lists:
        ArrayList<Integer> subList1 = new ArrayList<>(listValues.subList(0, listValues.size() / 2));
        ArrayList<Integer> subList2 = new ArrayList<>(listValues.subList(listValues.size()/2, listValues.size()));
        if (listValues.size() % 2 != 0) {
            subList1.add(subList2.get(0));
        }
        Collections.reverse(subList2);
        return subList1.equals(subList2);
    }
}
