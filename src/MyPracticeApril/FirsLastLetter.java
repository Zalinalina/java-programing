package MyPracticeApril;
import  java.util.*;
public class FirsLastLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words ={input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()}; //{"few", "book", "name", "apple"};



        for (String letters : words) {
            System.out.println("" +letters.charAt(0)+ letters.charAt(letters.length()-1));

        }

        }

    }