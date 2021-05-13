package MyPractice;
import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        System.out.println("Enter cents: ");
        Scanner scan = new Scanner(System.in);
        int cents, quarter, dimes, nickels, pennies, change;

        //change = cents / 25 / 10;


        cents = scan.nextInt();
        quarter = cents / 25 ;
        dimes = cents %25 / 10;
        nickels = cents % 25 % 10 / 5;
        pennies = cents% 25 %10 %5  /1;

        if (cents >= 0 && cents < 100) {
            System.out.println("Your change is " + quarter + " quarters, " + dimes + " dimes, " + nickels + " nickels, " + pennies + " pennies");
            System.out.println("Invalid cents amount");
        }

        }
    }
