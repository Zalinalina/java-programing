package day20_string_manipulations;

import java.util.Locale;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i"));//true
        System.out.println(company.contains("ital"));//true
        System.out.println(company.contains("l o"));//true
        System.out.println(company.contains("j"));//false
        System.out.println(company.contains("One"));//false


        if (company.contains(" ")) {
            System.out.println("multiple words company name");

        } else {
            System.out.println("single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")) {//true
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Pass - title check failed");
        }

        String firstname = "ahmed";
        if (firstname.contains("a") && firstname.contains("e")) {
            System.out.println("both a && e are present");
        } else {
            System.out.println("a || e not present");
        }
        firstname = "Nadir";
        if (firstname.contains("a") || firstname.contains("i")) {
        System.out.println(("a or i is present"));
    }else {
            System.out.println("not a or i is present");

        }
       String email = "zalinasoria@gmail.com";
        if(email.contains("@") && email.endsWith(".com")) {
            System.out.println("valid email");
        }else{
            System.out.println("invalid email");
        }

        if(email.toLowerCase().contains("d")) {//chaining to lower case and after check the word
            System.out.println("d is present");
        }else{
            System.out.println("d not present");
        }
        String word = "java";
       // System.out.println(word.replace("a","u");
        //System.out.println(word);



    }
}
