package MyPractice;

import java.util.Locale;
import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        System.out.println("Your initials are " +firstName.toUpperCase().charAt(0)+ ""
                +lastName.toUpperCase().charAt(0));


    }
}
