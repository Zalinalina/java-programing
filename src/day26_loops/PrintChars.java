package day26_loops;

import java.util.Scanner;

public class PrintChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int count =0;
         for (int i = 0; i < word.length(); i++) {

           // System.out.print((word.charAt(i)+ " "));
             //System.out.print(i);

            System.out.println(i + "" +word.toUpperCase().charAt(i)+ " ");

        // for (int n = 0; n < word.length(); n++) {
        // System.out.println(word.charAt(n));
//}
      //  String word = "application";
       // for (int b = word.length()-1; b >=0; b--) {
        //    System.out.print(word.charAt(b) + " ");
        }
    }
}


