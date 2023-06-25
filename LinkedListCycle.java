package Leetcode;

public class LinkedListCycle {
    static LinkedListCycle classObject = new LinkedListCycle();
    public boolean hasCycle(ListNode head) {
        // Two Pointer Approach:
        // Move slowPointer one step at a Time,
        // Move fastPointer two steps at a Time.
        // If at any moment, slowPointer == fastPointer, then Cycle exists.
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        if (head == null || head.next == null) {
            return false;
        }

        while (fastPointer.next != null && fastPointer.next.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
