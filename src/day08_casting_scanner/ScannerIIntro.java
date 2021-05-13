package day08_casting_scanner;

import java.util.Scanner;

public class ScannerIIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");//ask the question

        String firstname = scan.next();//
        System.out.println("Nice to meet you, " + firstname);
    }
}
