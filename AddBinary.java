package Leetcode;

public class AddBinary {
    static AddBinary classObject = new AddBinary();
    public String addBinary(String a, String b) {
        StringBuilder finAns = new StringBuilder();
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;

        while (aLength >= 0 || bLength >= 0) {
            int sum = carry;
            if (aLength >= 0) {
                sum += a.charAt(aLength) - '0';
            }
            if (bLength >= 0) {
                sum += b.charAt(bLength) - '0';
            }
            finAns.append(sum % 2);
            carry = sum / 2;

            aLength--;
            bLength--;
        }

        if (carry == 1) {
            finAns.append(carry);
        }

        return finAns.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        System.out.println(classObject.addBinary(a, b));
    }
}
