package OfficeHours.Practice_05_10_2021;

import java.util.ArrayList;

public class Separate1 {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);
            if (Character.isLetter(eachChar)) {
                letter.add(eachChar);
            } else if (Character.isDigit(eachChar)) {
                digit.add(eachChar);
            } else {
                chars.add(eachChar);

            }
        }
        System.out.println("letter = " + letter);
        System.out.println("chars = " + chars);
        System.out.println("digit = " + digit);


        System.out.println(separateString(str));
    }

    public static ArrayList<ArrayList<Character>> separateString(String str) {
        ArrayList<ArrayList<Character>> all = new ArrayList();

//             refrance                  value
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();
        all.add(letter);
        all.add(chars);
        all.add(digit);

//            the same thing

        // all.add(new ArrayList<>());
        // all.add(new ArrayList<>());
        //  all.add(new ArrayList<>());


        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);
            if (Character.isLetter(eachChar)) {
                all.get(0).add(eachChar);
            } else if (Character.isDigit(eachChar)) {
                all.get(1).add(eachChar);
            } else {
                all.get(2).add(eachChar);

            }
        }
        return all;
    }
}
