package OfficeHours.Practice_04_07_2021;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
     //   Scanner scan = new Scanner(System.in);
       // int A = scan.nextInt(), count = 0;
      //  for (int i = 1; i <= A; i++) {
        //    count = 0;
        //    for (int j = 1; j <= i; j++) {
        //        if (i % j == 0) {
        //            count++;
         //       }
       //     }
       //     if (count == 2) {
        //     //   System.out.println(i);
          //  }
      //  }


        int number = 50;



        // 5/2, 5/3, 5/4

        for(int j = 2; j <= number; j++) {
            boolean isPrime = true;

            for(int i = 2; i < j; i++){
                if(j % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                System.out.print(j  + " ");
            }

        }

        }

    }

