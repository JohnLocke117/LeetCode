package Leetcode;

import java.util.Arrays;

public class FindTheHighestAltitude {
    static FindTheHighestAltitude classObject = new FindTheHighestAltitude();
    public int largestAltitude(int[] gain) {
        int[] temp = new int[gain.length + 1];
        temp[0] = 0;
        for(int i = 1; i < temp.length; i++) {
            temp[i] = gain[i - 1];
        }

        for (int j = 1; j < temp.length; j++) {
            temp[j] = temp[j - 1] + temp[j];
        }
        System.out.println(Arrays.toString(temp));
        return Arrays.stream(temp).max().getAsInt();
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        System.out.println(classObject.largestAltitude(gain));
    }
}
