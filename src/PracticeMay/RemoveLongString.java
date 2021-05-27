package PracticeMay;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>((Arrays.asList("one", "two", "three", "four", "five", "six")));
        System.out.println(longWord(words, 4));
    }

    public static ArrayList<String> longWord (ArrayList<String> words, int max){
        words.removeIf(each -> each.length() < max);
        return words;
    }
    //This method will accept an ArrayList of Strings and an int.
    //
    // Remove any String elements that have less characters than the given number.
    // Return the modified ArrayList of Strings@param list -Given ArrayList of
    // Strings@param int -max number of characters @return -ArrayList of StringsEx:
    // {“one,”, “two”, “three, “four”, “five”, “six”}Max number: 4Output: {“three, “four”, “five”
}
