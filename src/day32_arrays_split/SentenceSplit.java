package day32_arrays_split;
import java.util.*;
public class SentenceSplit {
    public static void main(String[] args) {

        String sentence = "java is fun";
        String[] words = sentence.split(" ");
        System.out.println("1st word = " + words[0]);
        System.out.println("2nd word = " + words[1]);
        System.out.println("3nd word = " + words[2]);
        //System.out.println("4nd word = " + words[3]);//out of bound

        for (String w : words) {
            System.out.println(w);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] result = googleResult.split(" ");
        System.out.println("Count = " + result[1]);
        System.out.println("Seconds = " + result[3].replace("(", ""));
        System.out.println("Seconds = " + result[3].substring(1));




    }
}
