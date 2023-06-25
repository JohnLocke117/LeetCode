package Leetcode;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode dummyHead = new ListNode();
        dummyHead.next = head;

        // Two Pointers:
        ListNode left = dummyHead;
        ListNode right = head;

        // Move the right Pointer:
        while(n > 0 && right != null) {
            right = right.next;
            n -= 1;
        }

        // Shift both the Pointers:
        while(right != null){
            right = right.next;
            left = left.next;
        }

        // Now, the left Pointer is at the nth Node, that is to be removed:
        left.next = left.next.next;
        return dummyHead.next;
    }
}
