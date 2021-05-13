package OfficeHours.Practice_03_09_2021;
import java.util.Scanner;
public class SecondsConvertor {
    public static void main(String[] args) {

        int inputSeconds, hour, minutes, second;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        inputSeconds =scan.nextInt(); //3695
         /*
         How many seconds in an hour?
         60 sec = 1 minute
         60 min = 1 hour
         60 * 60 = 3600
          */
        int hours = inputSeconds / 3600; //3695/3600=1
       // inputSeconds = inputSeconds % 3600; //95
        inputSeconds %= 3600;  //the same thing as above^
        minutes = inputSeconds /60; // 95 / 60 = 1
        inputSeconds %= 60;//35
       int  seconds = inputSeconds;

        System.out.println(hours + " hour, " + minutes + " minute, "+seconds +" seconds.");
    }

}
