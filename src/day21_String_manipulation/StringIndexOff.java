package day21_String_manipulation;

public class StringIndexOff {
    public static void main(String[] args) {
        String word = "javja";
        System.out.println((word.indexOf("j")));

        String word1 = "github project";
        System.out.println(word1.indexOf("g"));//0
        System.out.println(word1.indexOf("u"));//4
        System.out.println(word1.indexOf("hub"));//3 because  h=3
        System.out.println(word1.indexOf("java"));// -1
        System.out.println(word1.indexOf("t"));//2
    }
}
