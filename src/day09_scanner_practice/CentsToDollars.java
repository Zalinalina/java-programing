package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();//int cents = 255;
        int dollars = cents / 100;
        int remainingCents= cents % 100;

        System.out.println("Dollars = "+dollars);
        System.out.println("Cents = "+ cents);
        System.out.println("remainingCents = "+ remainingCents);
        System.out.println("In " + cents + " cents : " + dollars +" dollars " + " and "+remainingCents+ " cents." );


    }
}
