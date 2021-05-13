package MyPracticeApril;

//import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String word = scan.next();
       // int upperCase = 0;
       // int lowerCase = 1;
       // for (int i = 0; i<word.length();i++){
       //     if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
         //       upperCase++;
         //   }
      //  }
      //  System.out.println(upperCase + lowerCase);





        String str = "thisHasManyWordsToFind";
        int words = 1;

        for (int i = 0; i<str.length();i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                words++;
            }
        }
        System.out.println("Words: " +words);

    }
}
