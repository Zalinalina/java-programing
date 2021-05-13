package day19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {
        String name = "Zalina";
        System.out.println(name.length());

        String nameFB = "Za lina";
        System.out.println(name.length());

        String word = "java";//count space
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " +word.length());
        System.out.println("wooden spoon".length());

        String firstName = "Sergio";
        System.out.println(firstName +" " +firstName.length());
        System.out.println("Sergio".length());


        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "hello";
        // if statement :
        //when password is at least 6  characters
        //print: valid amazon password
        //else
        //print : password too short

        if (password.length() >= 6) {
            System.out.println("Valid amazon password");
        }else{
            System.out.println("Password too short. It must be at least 6 characters.");


        }
    }
}
