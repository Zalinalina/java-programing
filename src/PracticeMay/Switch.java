package PracticeMay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Switch {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));
        System.out.println(SwitchPairs(words));
    }
    //This method will take an ArrayList of words and switch position for each pair in the List.
    // A pair is an element and the element next to it. The given ArrayList will always have an even number
    // of elements so each elementwill always have a single pair. @param words -Given ArrayList of Strings@return
    // -ArrayList of StringsEx:Input: {"Cat", "in", "the", "hat"}There is two pairs:
    // "Cat" and "in""the" and "hat"Output: {"in", "Cat", "hat", "the}
    public static ArrayList<String> SwitchPairs (ArrayList<String> words) {
        for (int i = 0; i <words.size() ; i+=2) {
            Collections.swap(words, i, i+1);

        }
        return words;
}

}