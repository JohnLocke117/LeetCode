package Leetcode;

public class MergeStringsAlternatively {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i;
        for (i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        if (word1.length() > word2.length()) {
            result.append(word1.substring(i));
        } else {
            result.append(word2.substring(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "abcd";
        String word2 = "pq";

        MergeStringsAlternatively class_object = new MergeStringsAlternatively();
        System.out.println(class_object.mergeAlternately(word1, word2));
    }
}
