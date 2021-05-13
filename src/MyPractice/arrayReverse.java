package MyPractice;

import java.util.Arrays;

public class arrayReverse {
    public static void main(String[] args) {


        String[] words = {"apple", "cat", "dog", "peach"};//[null, null, null, null]
        String[] reverse = new String[words.length];
        for (int j = 0; j < words.length; j++) {
            for (int i = words.length-1; i >= 0; i--) {
                // for (int i = words.length-2, j=1; i>=0; j++, i--) {
                reverse[j] = words[i] +" ";
            }
        }
        System.out.println(Arrays.toString(reverse));
    }

}
