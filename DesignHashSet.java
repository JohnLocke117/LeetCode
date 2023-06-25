package Leetcode;

public class DesignHashSet {
    boolean[] tempArray;
    public void MyHashSet() {
        tempArray = new boolean[1000000 + 1];
    }

    public void add(int key) {
        tempArray[key] = true;
    }

    public void remove(int key) {
        tempArray[key] = false;
    }

    public boolean contains(int key) {
        return tempArray[key];
    }
}
