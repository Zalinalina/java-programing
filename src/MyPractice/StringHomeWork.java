package MyPractice;
import java.util.Scanner;
public class StringHomeWork {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();
        String lastName = scan.next();
        if(fullName.endsWith(lastName)) {
            System.out.println("Same last name");
        }else{
            System.out.println("Not same last name");
        }
        System.out.println("=============================================================");






    }
}
