package PracticeMay;

import java.util.ArrayList;
import java.util.Arrays;

public class GetUppercaseOrLowerCase {
    public static void main(String[] args) {
        String word = "abFVGshbfBHY";
        System.out.println(upperCase(word, true ));
        System.out.println(upperCase(word, false ));
    }
    public static ArrayList<String> upperCase(String word,boolean isUpperCase){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++){

            if (isUpperCase == true) {
                if(Character.isUpperCase(word.charAt(i))) {
                    list.add(word.charAt(i) + "");
                }
                }else if (Character.isLowerCase(word.charAt(i))){
                    list.add(word.charAt(i) + "");

                }
            }
return list;
    }

   // The method will accept a String and a boolean.
   // -If the given boolean is true, then extract all the uppercase letters and return them in an ArrayList.
   // -If the given boolean is false, then extract all the lowercase letters and return them in an
   // ArrayList@param str -Given String@param isUpper-Given boolean@return -
  //  java.util.ArrayList of Strings
}
