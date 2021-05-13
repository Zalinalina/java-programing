package OfficeHours.Practice_04_27_2021;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    /*
    [Anagram]

Create a method that will accept two Strings. Check if the two Strings are anagram of each other. If they are anagram return true otherwise return false.

Anagram means the characters of the words are the same, but rearranged in different orders

For example:
	listen and silent are anagram because the characters in 'listen' can be rearranged to make 'silent'
     */
    public static void main(String[] args) {
isAnagram("abc","cda");
    }
    //toCharArray - sort - equal?
    //loop through one string - remove the char that you iterate through
    //in the other String - if empty the 2nd String is empty
    public static boolean isAnagram (String one, String two){
        if(one.length() != two.length()) {
            return false;
        }

        one = one.toLowerCase();
        two = two.toLowerCase();
        int [] count = new int[26];//26 letters in alphabet


        //listen-> l+1, i+1, s+1
        //silent-> s-1; i-1; l-1

        // ab  a+1, b+1
        //bc b-1, c-1

        // a -> 0. b=1, c=2
        // z -> 25


        for(int i = 0; i < one.length(); i++){
            char letterFromOne = one.charAt(i);// a->97 - 97 , b -> 98-97=1, z -> 122 - 97 =25  // assci
            char letterFromTwo = two.charAt(i);

            count[letterFromOne - 'a'] = count[letterFromOne-97] +1;
            count[letterFromTwo - 97] = count[letterFromTwo-97] -1;
            System.out.println(Arrays.toString(count));
        }

        return Arrays.equals(count,new int[26]);
    }
}
