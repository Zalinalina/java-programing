package OfficeHours.Practice_04_13_2021;
import  java.util.*;
public class switchArr {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        for (int each : arr){
            switch (each){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
            }
        }


    }
}
