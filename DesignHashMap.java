package Leetcode;

import java.util.Arrays;

public class DesignHashMap {
    int[] tempArray;
    public void MyHashMap() {
        tempArray = new int[1000000 + 1];
        Arrays.fill(tempArray, -1);
    }

    public void put(int key, int value) {
        tempArray[key] = value;
    }

    public int get(int key) {
        return tempArray[key];
    }

    public void remove(int key) {
        tempArray[key] = -1;
    }
}
