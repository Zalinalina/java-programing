package MyPractice;
import  java.util.Scanner;
public class separator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        int wordCount = 0;


      //  for (int i = ; i<= count ; i--) {


            word += separator;
            wordCount++;
           if(wordCount == count){

           }

            System.out.println(word+separator);
        }

    }


