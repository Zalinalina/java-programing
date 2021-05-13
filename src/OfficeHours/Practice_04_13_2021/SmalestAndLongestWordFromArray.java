package OfficeHours.Practice_04_13_2021;

import java.util.Arrays;
import java.util.Scanner;

public class SmalestAndLongestWordFromArray {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("how many words will you enter:");
        String [] words = new String[input.nextInt()];
       // System.out.println(Arrays.toString(words));
        input.nextLine();
     for (int i =0 ; i < words.length; i++){
        // words[i] = input.nextLine();
         System.out.println("Enter word: " + (i+1));
         words[i] = input.nextLine();

     }
        System.out.println(Arrays.toString(words));
     // Sttring smalest, largest
        String [] smallAndLarge = {words[0],words[0] }; //null null
        // 0- smalest
        //1 - largest

        for(String eachWord :words){
            if(eachWord.length()< smallAndLarge[0].length()){
smallAndLarge[0] =eachWord;
            }
            if(eachWord.length() > smallAndLarge[1].length()) {
                smallAndLarge[1] = eachWord;
            }
        }
        System.out.println("smallest = " + smallAndLarge[0]);
        System.out.println("largest = " + smallAndLarge[1]);
        System.out.println(Arrays.toString(smallAndLarge));
}
}
