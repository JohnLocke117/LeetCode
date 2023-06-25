package Leetcode;

public class RemoveDuplicatesFromSortedList {
    static RemoveDuplicatesFromSortedList classObject = new RemoveDuplicatesFromSortedList();
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tempNode = head;
        if (tempNode == null) {
            return head;
        }
        while (tempNode.next != null) {
            if (tempNode.val == tempNode.next.val) {
                tempNode.next = tempNode.next.next;
            } else {
                tempNode = tempNode.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode nextNode1 = new ListNode(1);
        ListNode nextNode2 = new ListNode(2);
        head.next = nextNode1;
        nextNode1.next = nextNode2;
        nextNode2.next = null;

        // Printing the Output:
        ListNode newHead = classObject.deleteDuplicates(head);
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
