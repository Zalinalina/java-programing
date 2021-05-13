package day38_methods;
//import all static methods so you can jast call that by method name

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userMane = "";
        if (StringUtils.isNullorEmpty(userMane)) {
            System.out.println("Fail: Username cannot be null or empty");
        }
        System.out.println("isPalinrome(civic) = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak) = " + StringUtils.isPalindrome("kayak"));
        System.out.println("isPalindrome(Cybertek) = " + isPalindrome("Cybertek"));


        String word = "sunday";
        String revWord = StringUtils.reverse(word);
        System.out.println("word = " + word);
        System.out.println("revWord = " + revWord);
        System.out.println(StringUtils.reverse(word));

    }
    }
