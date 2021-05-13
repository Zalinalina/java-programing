package OfficeHours.Practice_05_11_2021;

import java.util.ArrayList;
import java.util.Scanner;

public class SeparatePartsChalenge2 {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> all = new ArrayList<>();

        for (int i =0; i < str.length(); i++){
            all.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(all);
        ArrayList<Character> digit = new ArrayList<>(all);
        ArrayList<Character> special = new ArrayList<>(all);


        letters.removeIf(eachChar -> !Character.isLetter(eachChar));
        digit.removeIf(eachChar -> !Character.isDigit(eachChar));
        special.removeIf(eachChar -> Character.isDigit(eachChar) || Character.isLetter(eachChar));

//Character.isLetterOrDigit();


        //Scanner s = new Scanner(System.in);
        System.out.println("letters = " + letters);
        System.out.println("digit = " + digit);
        System.out.println("special = " + special);


    }

}
