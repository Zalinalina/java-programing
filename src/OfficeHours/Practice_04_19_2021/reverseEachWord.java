package OfficeHours.Practice_04_19_2021;

import day38_methods.StringUtils;

public class reverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in Chicago"));


    }
    public static String reverseEachWord(String str){
        String reverse = "";

        for(String each : str.split(" ")){
            String eachReverse = "";

            //At usual loop going from last to first index
            reverse += StringUtils.reverse(each)+ " ";
        }
        return reverse.trim();
    }

}
