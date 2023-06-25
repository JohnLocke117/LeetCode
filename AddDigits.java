package Leetcode;

public class AddDigits {
    public int addDigits(int num) {
        String num_string = String.valueOf(num);
        int result = 0;
        for (int i = 0; i < num_string.length(); i++) {
            result += Integer.parseInt(String.valueOf(num_string.charAt(i)));
        }
        String temp = String.valueOf(result);
        if (temp.length() != 1) {
            result = addDigits(result);
        }
        return result;
    }

    public static void main(String[] args) {
        AddDigits class_object = new AddDigits();
        System.out.println(class_object.addDigits(38));
    }
}
