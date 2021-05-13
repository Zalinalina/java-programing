package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class emailStringReplit {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter two words");
        String wordOne = input.nextLine();
        String wordTwo = input.nextLine();
        String email = "";

        if (wordOne.length() >= 6 && wordTwo.length()>= 6) {

            email = wordOne.substring(0,4); //james
            email += wordTwo.substring(wordTwo.length()- 3);//Sec ret
            email += "@cybertek.com";
            System.out.println(email);

        }else{
            System.out.println("invalid data");
        }
    }
}
