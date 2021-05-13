package day23_String_manipulations_while_loop;

import java.util.Locale;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender: [       Saim      ] From Number <2223334444> Message: {Hello, lets code some java}";
        int start = message.indexOf("[");
        int end = message.indexOf("]");
        System.out.println(message.substring(start+1, end));
       // System.out.println(message);
        String sender= message.substring(start+1, end);
        System.out.println("sender = " + sender);

        String mobile = message.substring(message.indexOf("<")+1,message.indexOf(">"));
        System.out.println("mobile = " + mobile);

        String text = message.substring(message.indexOf("{")+1,message.indexOf("}"));
        String text1 = message.substring(35,45);
        System.out.println("text1 = " + text1);
        System.out.println("text = " + text);


        System.out.println("     Fikret    \t ".trim());// trim remove spaces on the right of left(corners)
sender = sender.trim();
        if (sender.equals("Saim")) {
            System.out.println("Message from Saim about homework");
        }else{
            System.out.println("Someone else message");


        }
        String word  = " s q l ";
        System.out.println("word = " + word.trim());


        String word1 = "Hello world";
        System.out.println(word1.toLowerCase().replace(" ","|").equals("Hello|World"));

    }
}
