package OfficeHours.Practice_05_25_2021;

import java.util.*;

public class Panagram {
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog";
      //  char []

        System.out.println(isPangram(s));
    }

    public static boolean isPangram (String str){
        str = str.toLowerCase();
        String alp = "aassdfffghjjkklppoiuytrewqzxcvbbnmq";
      //  for (int i = 'a'; i < 'z' ; i++) {
        //    System.out.println((char) i);

        for (int i = 0; i <str.length() ; i++) {
            if (Character.isLetter(str.charAt(i))){
           alp = alp.replace(""+str.charAt(i), "");
                System.out.println(str.charAt(i) + "" +alp);

        }
            if (alp.isEmpty()){
                break;
            }

        }
        return alp.isEmpty();

    }
}
