package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static PascalTriangle classObject = new PascalTriangle();
    public List<List<Integer>> generate(int numRows) {
        // Create a List of Lists:
        List<List<Integer>> pascal = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            ArrayList<Integer> tempList =  new ArrayList<>();
            for (int j = 1; j <= i; j++) {
                tempList.add(1);
            }
            pascal.add(tempList);
        }

        // Start the Triangle:
        if (numRows > 2) {
            for (int k = 2; k < numRows; k++) {
                List<Integer> previousList = pascal.get(k - 1);
                List<Integer> currentList = pascal.get(k);

                for (int m = 1; m < k; m++) {
                    currentList.set(m, previousList.get(m) + previousList.get(m - 1));
                }

                pascal.set(k, currentList);
            }
        }

        return pascal;
    }

    public static void main(String[] args) {
        System.out.println(classObject.generate(6));
    }
}