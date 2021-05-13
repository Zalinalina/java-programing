package Replitts.Methods;
import java.util.*;
public class printOnlyNumbers {




    public static String extractNum(String s) {
        String numStr = "";

        for (char currentChar : s.toCharArray()){
            if(currentChar >= '0' && currentChar <= '9')
       // for (int i = 0; i < s.length(); i++) {
         //   char currentChar = s.charAt(i);
           // if (Character.isDigit(currentChar)) {
                numStr += currentChar;
            }
        return numStr;
    }

        public static void main (String[]args){
            Scanner in = new Scanner(System.in);
            System.out.println(extractNum(in.next()));
    }



        }




