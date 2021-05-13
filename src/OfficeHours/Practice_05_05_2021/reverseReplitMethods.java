package OfficeHours.Practice_05_05_2021;
import java.util.*;
public class reverseReplitMethods {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(reverseNoSpec("Ab,c,de!$"));
        //edcbA


    }

    public static String reverseNoSpec(String str) {
        char[] letters = str.toCharArray();

        for (int i = 0, j = letters.length-1; i <= letters.length/2; i++) {
            // System.out.println(Arrays.toString(letters));

            if (Character.isLetter(letters[i])) {


                for ( ; j >= 0 ; j-- ){
                    if(Character.isLetter(letters[j])){

                        char temp = letters[i]; //A
                        letters[i] = letters[j]; //e
                        letters[j--] =temp;
                       //j--;
                        break;

                    }
                }

            }
        }

            //return Arrays.toString(letters).replaceAll("[" , "").replace("]", "").replace(",","");
        return String.valueOf(letters);
        }




}
