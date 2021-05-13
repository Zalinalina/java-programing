package OfficeHours.Practice_03_30_2021;

import java.util.Scanner;

public class MaxNumberFrom5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //int numOne = scan.nextInt();
       // int numTwo = scan.nextInt();
      //  int numThree = scan.nextInt();
        int first = scan.nextInt();

        int max = first;//0
        int min = first;
        //  if(numOne > max) {
        //   max = numOne;

        //  }
        //   if (numTwo > max) {
        //      max = numTwo;
        //  }

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number");
            int number = scan.nextInt();

            if (number > max) {
                max = number;

            }
            if (number < min) {
                min = number;
            }
            System.out.println("max: " + max);
            System.out.println("min: " + min);
        }
    }
}