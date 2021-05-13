package OfficeHours.Practice_03_22_2021;
import java.util.Scanner;
public class ScannerNextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        System.out.println("Enter your name");
        input.nextLine();
        String name = input.nextLine();
        System.out.println(number);
        System.out.println(name);


    }
}
