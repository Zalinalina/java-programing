package day19_class_vs_object_string;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Cybertek";
        String sentence = "Java IS Fun";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());


        System.out.println("java".toUpperCase());


        word.toLowerCase();
        System.out.println(word);

        String wordInCase = word.toLowerCase();
        System.out.println("wordInCase = " + wordInCase);

        word.toLowerCase();
        System.out.println(word);

// change word to all lowercase letters and assign back
        word = word.toLowerCase();
        System.out.println("word = " + word);

        System.out.println("===============================================================");


        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());

        //change variable company "Amazon" to "AMAZON"
        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
