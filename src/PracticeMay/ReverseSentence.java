package PracticeMay;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "java is fun";
        String[] sentenceArray = sentence.split(" ");
        String reversed = "";
        System.out.println(Arrays.toString(sentenceArray));
        for (int i =sentenceArray.length-1; i>=0; i--){
            //System.out.print(sentenceArray[i]+" ");
            reversed += sentenceArray[i] + " ";
        }
        System.out.println("sentence" + sentence);
        System.out.println("reversed = " + reversed.trim());
        }
}
