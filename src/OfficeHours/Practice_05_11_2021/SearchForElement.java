package OfficeHours.Practice_05_11_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "two"));
        System.out.println(findIndex(list, "two"));
        System.out.println(findIndex(list, "two", 2));
        System.out.println(findIndex(list, "two", findIndex(list, "two")+1));// the same is line
    }


    /**
     * @param words   - list of elements given
     * @param element - the element we are looking for
     * @return -the method returns the index where
     */


    public static int findIndex(ArrayList<String> words, String element) {

        int index = -1;
        for (int i =0; i < words.size(); i++) {
            if (words.get(i).equals(element)) {
                index = i;//return i;
                break;
            }
        }
        return index;
    }

    /**
     * @param words
     * @param element
     * @param startIndex
     * @return
     */


    public static int findIndex(ArrayList<String> words, String element, int startIndex) {

        int index = -1;
        for (int i = startIndex; i < words.size(); i++) {
            if (words.get(i).equals(element)){
                index = i;//return i;
                break;
            }
}
        return index;
    }
}