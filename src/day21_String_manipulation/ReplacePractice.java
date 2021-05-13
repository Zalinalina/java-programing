package day21_String_manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());//only for this line
        System.out.println(word.replace("hub","lab"));//only for this line
        System.out.println("word = " + word);//github
        word = word.replace("hub","lab");
        System.out.println("word = " + word);//gitlab

        System.out.println(word.replace('i','o').replace('a','i'));//only for this line

        String sentence = "java is fun";
        String withNoSpaces= sentence.replace(" ","");
        System.out.println("withNoSpaces = " + withNoSpaces);

        // sentence = sentence.replace("java","selenium");
        // sentence = sentence.replace ("fun","a lot of fun ") ;

        sentence = sentence.replace("java","selenium").replace("fun","a lot of fun ") ;
       // sentence = sentence.replace("java","selenium")
                         //  .replace("fun","a lot of fun ") ;
        System.out.println("sentence = " + sentence);
        System.out.println(sentence +withNoSpaces);
        
        String result = "1-48 of over 4,000 result for java book";
        result = result.replace("1-48 of over ", "")//one
                       .replace(",","")//state
                       .replace(" result for java book", "");//ment

        System.out.println("result = " + result);

        int count = Integer.parseInt(result);
        count++;
        if(count>0);
        System.out.println("");


    }
}
