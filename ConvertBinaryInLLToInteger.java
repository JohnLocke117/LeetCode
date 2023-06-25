package Leetcode;

public class ConvertBinaryInLLToInteger {
    public int getDecimalValue(ListNode head) {
        StringBuilder binaryNum = new StringBuilder();
        while (head != null) {
            binaryNum.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(String.valueOf(binaryNum), 2);
    }
}
