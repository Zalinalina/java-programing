package MyPractice;
import java.util.Scanner;
public class UserPassword {
    public static void main(String[] args) {
        /*
        Given a username and password verify they are valid.
    - The password cannot be less than 5 characters
        -> If it is less print: "Password cannot be less than 5 characters"
        -> If it is more then or equal to 5 print: "Valid password"

    - Also the password should not contain the username
        - If the password has the username in it print:
            "Invalid password, username should not be in it"
            -> Also change the password to have the value: "password"
lo
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String userName = scan.next();
        System.out.println("Enter password");
        String password = scan.next();
        if (password.length() < 5) {
            System.out.println("Password cannot be less than 5 characters");
        } else if (password.length() > 5 && (!password.contains(userName))) {
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password, username should not be in it");

                }

            }
        }

