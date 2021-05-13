package MyPractice;
import  java.util.Scanner;
public class strigReplit1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if (word.length() % 2 != 0) {
            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length() / 2));
            } else if (word.length() == 1) {
                System.out.println(word + word + word);
            }

        } else {
            if (word.length() % 2 == 0) {
                if (word.length() >= 4) {
                    int first =word.length() / 2 ;
                   // int second = word.length() / 2;
                    System.out.println(word.substring(first -1 , first +1));
                } else if (word.length() == 2) {
                    System.out.println(word + word);


                }
            }
        }
    }
}




