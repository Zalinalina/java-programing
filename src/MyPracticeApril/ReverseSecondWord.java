package MyPracticeApril;
import java.util.Scanner;

public class ReverseSecondWord {
    public static void main(String[] args) {

        String word = "I love java";
        String secondWord = word.substring(word.indexOf(" ") + 1, word.lastIndexOf(" "));
        String reverse = "";

        for (int i = secondWord.length() - 1; i >= 0; i--) {
            reverse += secondWord.charAt(i);
        }
        System.out.println(word.replace(secondWord, reverse));





        String sentence = "I love you";
        String reverseWord = "";
        int space1 = sentence.indexOf(" ") + 1;
        int space2 = sentence.lastIndexOf(" ");


        for(int n = space2; n >= space1; n--) {
            reverseWord += "" + sentence.charAt(n);

        }
        System.out.println(reverseWord);




    }

    }

