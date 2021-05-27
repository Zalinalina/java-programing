package PracticeMay;

import OfficeHours.Practice_05_10_2021.Separate;
import arrayListTest.first;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 1, 10, 8, 7));
        System.out.println(badPairs(number));
        //This method will accept an Integer ArrayList and check for bad pairs.
        // A pair is an element and the element next to it.
        // A bad pair is whenever the first number in the pair is bigger then thesecond number.
        // Remove any bad pairs for the ArrayList and return theArrayList with no bad pairsNote:
        // The given ArrayList will always be an even amountof numbers so each number always has one pair@param
        // nums-Given ArrayList of numbers@return -ArrayList of numbersEx: Input: {3, 4, 6, 1, 1, 10, 8, 7};
        // Output: {3, 4, 1, 10};Bad pairs that were removed: 6, 18, 7

    }
    public static ArrayList<Integer> badPairs (ArrayList<Integer> number) {
        for (int i = 0; i < number.size(); i += 2) {
            if (number.get(i) > number.get(i + 1)) {
                number.remove(i);
                number.remove(i);
            }
        }

        return number;
    }
}