package MyPractice;
import  java.util.*;
public class email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = email.substring(0,email.indexOf("_"));
        String lastName =email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        System.out.println("First name: " +firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase());
        System.out.println("Last name: " +lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase());
        System.out.println("Domain: " +domain);

    }
}
