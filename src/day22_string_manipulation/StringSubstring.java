package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
       //word.substring
        System.out.println(word.substring(2,4));//va
        System.out.println(word.substring(3));//a is fun
        System.out.println(word.substring(0,4));//java
        System.out.println(word.substring(0,7));//java is
        System.out.println(word.substring(5,7));//is
        System.out.println(word.substring(8,11));//fun


        System.out.println(word.substring(5));//is fun
        System.out.println(word.substring(8));//fun
    }
}
