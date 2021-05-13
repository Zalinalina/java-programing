package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        //substring + indexOf
        String result = "result count:12345";
        System.out.println(result.substring(13));


        //find the index of:
        System.out.println(result.indexOf(":"));//12
        int colonIndex = result.indexOf(":");//12
        System.out.println(result.substring(colonIndex+1));//12345 without :



        //we can combine in one statement
        System.out.println(result.substring(result.indexOf(":") ));//:12345
        System.out.println(result.substring(result.indexOf(":") +1));


        String today = "i learned [java] today";
        System.out.println(today.indexOf("["));
        System.out.println(today.indexOf("]"));


       // int start = today.indexOf("[");
        //int end = today.indexOf("]");
        //System.out.println(today.substring(start +1, end));
        System.out.println(today.substring(today.indexOf("[")+1,today.indexOf("]")));





    }
}
