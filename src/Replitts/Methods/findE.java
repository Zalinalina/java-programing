package Replitts.Methods;

import java.util.*;

public class findE {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }


    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e")) {
                count++;


            }
        }
        String[] fewValues = new String[count];
        String n = "";
        for (int i = 0, a = 0; i < fewValues.length; i++) {
            if(arr[i].contains("e")){


             // System.out.println(count);
            }
            }

            //YOUR CODE ENDS HERE -----------------------

            return fewValues;
        }


    }
