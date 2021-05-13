package OfficeHours.Practice_05_10_2021;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Separate {

        public static void main(String[] args) {

            String str = "ABCD123$%#@&456EFG!";
            List<List<String>> list = new ArrayList<>();
            list = separatePart(str);
            for (List each : list) {
                System.out.println(each);
            }
        }

        public static List<List<String>> separatePart(String str) {

            ArrayList<String> letter = new ArrayList<>();
            ArrayList<String> chars = new ArrayList<>();
            ArrayList<String> digit = new ArrayList<>();

            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    letter.add(str.charAt(i) + "");
                } else if (Character.isDigit(str.charAt(i))) {
                    digit.add(str.charAt(i) + "");
                } else {
                    chars.add(str.charAt(i) + "");
                }
            }

            ArrayList<List<String>> list = new ArrayList<>();
            list.add(letter);
            list.add(digit);
            list.add(chars);
            return list;
        }
    }

