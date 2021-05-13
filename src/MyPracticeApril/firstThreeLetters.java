package MyPracticeApril;
import java.util.*;
public class firstThreeLetters {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone!  write your code below.
        //Create another loop for your solution!
        for(String letters : arr){
            //System.out.println("" +  letters.charAt(0)+ letters.charAt(1) + letters.charAt(2));
            System.out.println(letters.substring(0,3));
        }



    }
}