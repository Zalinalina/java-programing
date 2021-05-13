package Practice_04_12_2021;

import java.util.Arrays;
import java.util.Scanner;
public class EvenAndOdd {
    public static void main(String[] args) {
/*
Write a program that can count the even and odd number from an array of integers
 UseforeachtomakeiteasierEx:Input: [4,1,3,12,5]Output: Even:2  Odd: 3
 */
Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you have?");
        int []nums = new int [scan.nextInt()];
        for (int i = 0; i < nums.length; i++) {
           System.out.println("Enter number " + (i + 1));
            nums[i] = scan.nextInt();
        }
//counting even and odd numbers
       // int[] nums = {4, 1, 3, 12, 5};
        int even = 0;
        int odd = 0;
// String even += num + " " split by space -> String []
       for (int eachNum : nums) {
           if (eachNum % 2 == 0) { // cheks odd: eachNum % 2 !=0 0r eachNum % 2 == 1
               even++;
            } else {
               odd++;
            }

        }
        //used the counters even and odd to store values
        int[] evenNumber = new int[even];
        int[] oddNumber = new int[odd];
        //we go trough every element to check even or odd
        // System.out.println("even = " + even);
        //  System.out.println("odd = " + odd);


        // i - keep track of the indexes in your nums array
        //e - keep track of the indexes in your evenNumbers array
        //o - keep track of the indexes in your oddNumbers array
        for (int i = 0, e = 0, o = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) { // cheks odd: eachNum % 2 !=0 0r eachNum % 2 == 1
               evenNumber[e++] = nums[i];//0

            } else {
                oddNumber[o++] = nums[i];

            }
        }
        System.out.println("Even array:" + Arrays.toString(evenNumber));
        System.out.println("Odd array: " +Arrays.toString(oddNumber));
    }
}