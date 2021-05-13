package MyPractice;

import ReplitArrayList.sum;

public class NewClass {

    public static void main(String[] args) {


        String weather = "Today is cloudy and cold";


        //  if (c.contains("dy")) {
        //    System.out.println("true");
        // } else {
        //    System.out.println("false");

        //     if (c.equalsIgnoreCase("Today is cloudy and cold")) {
        //         System.out.println("true");
        //    } else {
        //         System.out.println("false");

        //        c = c.toUpperCase();
        //       System.out.println(c);


        String word = "";
        for (int i = 0; i < weather.length()-1; i++) {
            word += weather.charAt(i) + " * ";

        }
        System.out.println(word.substring(0,word.length()));

        String reverse = "";
        for (int i = weather.length()-1; i >= 0 ; i--) {
            reverse += weather.charAt(i);



        }
        System.out.println(reverse);

    }

}









