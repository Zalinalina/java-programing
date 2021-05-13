package ReplitArray;
import java.util.*;
public class firstandlastletter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
String result = "";
        for (int i = 0; i < words.length; i++) {

            result += ("" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1) +" ");
        }
            String [] word = result.split(" ");
           System.out.print(Arrays.toString(word));



    }
}
