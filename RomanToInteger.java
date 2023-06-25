package Leetcode;

public class RomanToInteger {
    static RomanToInteger classObject = new RomanToInteger();

    public int romanToInt(String s) {
        int answer = 0, value = 0, prev = 0;

        for (int i = 0; i < s.length(); i++) {
            // Define the Values:
            switch (s.charAt(i)) {
                case 'I' -> value = 1;
                case 'V' -> value = 5;
                case 'X' -> value = 10;
                case 'L' -> value = 50;
                case 'C' -> value = 100;
                case 'D' -> value = 500;
                case 'M' -> value = 1000;
            }

            // Calculate:
            if (value < prev) {
                answer -= value;
            } else {
                answer += value;
            }
            prev = value;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(classObject.romanToInt(s));
    }
}
