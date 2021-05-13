package day23_String_manipulations_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den spo on";
        System.out.println(word.toUpperCase().toLowerCase().length());

        System.out.println(word.replace(" ", "").toUpperCase());


        String city = "ISTANBUL";
        //                 read 1st letter.makeUpcase       + read 2nd till last makes to lower case
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

       // city.isEmpty().toUpperCase is boolean doesnt work

    }
}
