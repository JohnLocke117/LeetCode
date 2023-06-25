package Leetcode;

public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode tempNode = head;
        // Traverse the LL, find it's Length:
        int length = 0;
        while (tempNode != null) {
            length++;
            tempNode = tempNode.next;
        }

        System.out.println(length);

        // Now find the Middle Node:
        tempNode = head;
        for (int i = 0; i < length/2; i++) {
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.val);
        return tempNode;
    }
}
