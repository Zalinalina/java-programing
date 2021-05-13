package day19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {
        String countryCode = "KG";
        //usa               ==                      USA//fail
        //KH                ==                      KG//pass
        //if (countryCode.equals("UK")){
        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println("Pass - case is correct");
        }else{
            System.out.println("Fail - case is incorrect");
        }

        String word = "Java";
        String uWord = word.toUpperCase();
        System.out.println(word);//JAVA
        System.out.println(uWord);//JAVA

        if (word.equals(uWord)) {//false
            System.out.println("case match");
        }else {
            System.out.println("case doesn't match");

        }
        }
    }

