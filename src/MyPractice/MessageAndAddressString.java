package MyPractice;
import java.util.Scanner;
public class MessageAndAddressString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        if (message.contains("idiot") || message.contains("dumb") || message.contains("heck")) {
            System.out.println("Message not sent");
        } else {
            System.out.println("Message sent");
        }


        String address = scan.nextLine();
        if (address.isEmpty()){
        //if (!address.isEmpty()){
            //System.out.println(address);
       System.out.println("Address not found");
    }else{
            System.out.println(address);
            //System.out.println("Address not found");

        }

    }
}