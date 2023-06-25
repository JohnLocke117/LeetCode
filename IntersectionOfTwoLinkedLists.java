package Leetcode;

public class IntersectionOfTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Find Length of both LL:
        ListNode temp = headA;
        int lengthA = 0;
        while (temp != null) {
            lengthA++;
            temp = temp.next;
        }

        temp = headB;
        int lengthB = 0;
        while (temp != null) {
            lengthB++;
            temp = temp.next;
        }

        // Create tempNodes for Both LLs:
        ListNode tempNodeA = headA;
        ListNode tempNodeB = headB;

        // Move both tempNodes to same Level:
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                tempNodeA = tempNodeA.next;
            }
        } else {
            for (int i = 0; i < lengthB - lengthA; i++) {
                tempNodeB = tempNodeB.next;
            }
        }

        // Now both tempNodes are at same position in their Lists, start a common loop:
        while (tempNodeA != null && tempNodeB != null) {
            if (tempNodeA == tempNodeB) {
                return tempNodeA;
            }

            tempNodeA = tempNodeA.next;
            tempNodeB = tempNodeB.next;
        }

        return null;
    }
}
