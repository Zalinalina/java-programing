package OfficeHours.Practice_03_24_2021;

import java.util.Locale;

public class CharIndex {
    public static void main(String[] args) {
        String s = "java";
        //          0123
        //charAt(4) - exception
        //System.out.println(s.charAt((s.length())));//stringIndexOfOutBoundsException
        System.out.println(s.charAt(s.length()-1));//a
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));


        System.out.println(s.charAt(0)+""+s.charAt(3) );//add numbers summarize numbers no letters you have to add ""
        String upper =""+ s.toUpperCase().charAt(0)+ s.toUpperCase().charAt(3);
        // JAVA
        System.out.println(upper);


        System.out.println(s.indexOf('a'));//1
        System.out.println(s.indexOf('m'));//-1
        System.out.println(s.contains("j"));
        System.out.println(s.indexOf('j')>=0  ?  "Contains": "Not contains");
        System.out.println(s.indexOf('g')>=0 ?   "Contains": "Not contains" );
        System.out.println(s.toLowerCase().contains("a"));
        System.out.println(s.toLowerCase().startsWith("a"));
        // boolean.String method
        System.out.println(s.toLowerCase().replace("j","e").startsWith("a"));
    }
}
