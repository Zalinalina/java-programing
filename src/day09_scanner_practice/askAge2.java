package day09_scanner_practice;
import java.util.Scanner;

public class askAge2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = scan.nextInt(); //int age = 33;
        //System.out.println(age);
       // scan.nextInt();
        System.out.println(age + " - that's great age!");
        //scan.close(); optionally close the scanner

    }
}
