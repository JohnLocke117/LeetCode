package Leetcode;

import java.util.Arrays;

public class SuccessfulPairsofSpellsandPotions {
    public int binarySearch(int spell, int[] potions, long success) {
        int start = 0;
        int end = potions.length - 1;

        if (start == end) {
            if ((long) spell * potions[start] < success) {
                return -1;
            } else {
                return start;
            }
        }

        while (end != start + 1) {
            int mid = (start + end) / 2;
            if ((long) spell * potions[mid] >= success) {
                end = mid;
            } else if ((long) spell * potions[mid] < success) {
                start = mid;
            }
        }

        if (((long) spell * potions[end] < success) && (end == potions.length - 1)) {
            return -1;
        }
        else if ((long) spell * potions[start] < success) {
            return end;
        }
        return start;
    }


    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        System.out.println(Arrays.toString(potions));

        int[] pairs = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            // Find Lower Limit:
            SuccessfulPairsofSpellsandPotions class_object = new SuccessfulPairsofSpellsandPotions();
            int lower_limit = class_object.binarySearch(spells[i], potions, success);

            if (lower_limit == -1) {
                pairs[i] = 0;
            } else {
                pairs[i] = potions.length - lower_limit;
            }
        }
        return pairs;
    }

    public static void main(String[] args) {
        int[] spells = {40,11,24,28,40,22,26,38,28,10,31,16,10,37,13,21,9,22,21,18,34,2,40,40,6,16,9,14,14,15,37,15,32,4,27,20,24,12,26,39,32,39,20,19,22,33,2,22,9,18,12,5};
        int[] potions = {31,40,29,19,27,16,25,8,33,25,36,21,7,27,40,24,18,26,32,25,22,21,38,22,37,34,15,36,21,22,37,14,31,20,36,27,28,32,21,26,33,37,27,39,19,36,20,23,25,39,40};
        int success = 600;

        SuccessfulPairsofSpellsandPotions obj = new SuccessfulPairsofSpellsandPotions();
        System.out.println(Arrays.toString(obj.successfulPairs(spells, potions, success)));
    }
}
