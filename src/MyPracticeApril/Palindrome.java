package MyPracticeApril;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String reverse = "";

        for(int i = word.length()-1; i >=0 ;i --) {
           reverse+=word.charAt(i);

            System.out.print(word.charAt(i));

        }
        System.out.println();
        System.out.println(word.equals(reverse));

        //System.out.print(reverse);
       // System.out.println(word.substring(n).equals

    }
}
