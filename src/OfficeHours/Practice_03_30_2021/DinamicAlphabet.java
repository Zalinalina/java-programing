package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class DinamicAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("do you want uppercase or lowercase");

        String upperOrLower = scan.next();
        String assendingOrDecending = scan.next();
        int srarting;
        int ending;

        if (upperOrLower.equals("uppercase")) {
            srarting = 'A';
            ending = 'Z';

        } else {
            srarting = 'a';
            ending = 'z';

        }

        if (assendingOrDecending.equals("ascending"))
            for (int i = srarting; i <= ending; i++) {

                // for(int i = 'A'; i <= 'Z'; i++) {

                // System.out.println(i + "");
                System.out.print((char) i + "");
            }
        else {
            for (int i = ending; i <= srarting; i--) {
                System.out.print((char) i + "");
            }
        }
    }
}
