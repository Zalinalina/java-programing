package OfficeHours.Practice_05_20_2021;

//This method will accept an ArrayList of Strings and an int.
//
// Remove any String elements that have less characters than the given number.
// Return the modified ArrayList of Strings@param list -Given ArrayList of
// Strings@param int -max number of characters @return -ArrayList of StringsEx:
// {“one,”, “two”, “three, “four”, “five”, “six”}Max number: 4Output: {“three, “four”, “five”

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongString {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>((Arrays.asList("one", "two", "three", "four", "five", "six")));
        System.out.println(removeLongString(words, 5));
    }

    public static ArrayList<String> removeLongString(ArrayList<String> list, int minLength) {
        //  list.removeIf(each -> each.length() < minLength);
        //  return list;
        ArrayList<String> validString = new ArrayList<>();

        for (String word : list) {
            if (word.length() >= minLength) {
                validString.add(word);
            }
        }
        return validString;
    }

    public static ArrayList<String> removeLongString2(ArrayList<String> list, int minLength) {
        list.removeIf(each -> each.length() < minLength);
    return list;
    }
}


