package ProblemSet1;
 import java.util.Scanner;
public class CharCheckerS4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char charValue = scan.next().charAt(0);
       //char charValue = 'V';
       if (charValue>= 97 && charValue<=122) {
           System.out.println("lower case: " + charValue);
       }else if(charValue >= 65 && charValue<= 90) {
           System.out.println("Upper case:" + charValue);
       }else{
           System.out.println(charValue + " is not letter ");
       }

       char letter ='A';
       if(letter >= 'A' && letter <= 'Z') {
           System.out.println(letter + " is a uppercase letter");
       }else if (letter>= 'a' && letter<='z') {
       }else{
           System.out.println("Not a valid letter");
       }
    }
}
