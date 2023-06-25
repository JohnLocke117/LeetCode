package Leetcode;

import java.util.*;

public class FlippingAnImage {
    static FlippingAnImage classObejct = new FlippingAnImage();
    public int[][] flipAndInvertImage(int[][] image) {
        // Flip Each Row:
        for (int i = 0; i < image.length; i++) {
            for(int j = 0; j < (image[i].length + 1) / 2; j++) {
                int k = image[i][j] ^ 1;
                image[i][j] = image[i][image[i].length - j - 1] ^ 1;
                image[i][image[i].length - j - 1] = k;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        for (int[] row : classObejct.flipAndInvertImage(image)) {
            System.out.println(Arrays.toString(row));
        }
    }
}
