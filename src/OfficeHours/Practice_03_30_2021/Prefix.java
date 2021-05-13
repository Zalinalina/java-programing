package OfficeHours.Practice_03_30_2021;

import java.security.spec.RSAOtherPrimeInfo;

public class Prefix {
    public static void main(String[] args) {


        String str= "abXYabs"; //java
        int n = 1;//2
        //jav

        String prefix = str.substring(0, n);//0,2 -ab
        String remaining = str.substring(n);//XYabc

        System.out.println(remaining.contains(prefix));
    }
}
