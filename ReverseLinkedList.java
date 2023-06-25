package Leetcode;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prevNode = null;
        ListNode currentNode = head;
        while (currentNode != null) {
            ListNode tempNode = currentNode.next;
            // Swap the Nodes:
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = tempNode;
        }
        return prevNode;
    }
}
