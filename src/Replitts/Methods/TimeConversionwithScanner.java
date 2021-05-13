package Replitts.Methods;
import  java.util.*;
public class TimeConversionwithScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        timeConversion(scan.nextLine());
    }

    public static void timeConversion(String s) {
        /*
         * Write your code here.
         */

        String militaryTime = "";
        if (s.contains("AM")) {
            s = s.replace("AM", "");
            String[] timeArray = s.split(":");
            if (timeArray[0].equals("12")) {
                timeArray[0] = "00";
            }
                militaryTime = String.join(":", timeArray);
                System.out.println(militaryTime);


            } else if (s.contains("PM")) {
                s = s.replace("PM", "");
                String[] timeArray = s.split(":");

                if (!timeArray[0].equals("12")) {
                    timeArray[0] = Integer.toString(Integer.parseInt(timeArray[0]) + 12);
                    militaryTime = String.join(":", timeArray);
                } else
                    militaryTime = String.join(":", timeArray);
                System.out.println(militaryTime.trim());


            }
        }

    }


