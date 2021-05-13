package MyPracticeApril;

import java.util.Scanner;

public class CountUpLowAndNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countNumbers = 0;

        for (int i = 0; i <= word.length() - 1; i++) {
            char letter = word.charAt(i);

            if(letter >= 'A' && letter <= 'Z') {
                countUpperCase++;
            }
                if(letter > 'a' && letter < 'z') {
                    countLowerCase++;
                }
                    if(letter > '0' && letter < '9') {
                        countNumbers++;
                    }

            }
        System.out.println(countUpperCase + " uppercase letters" );
        System.out.println(countLowerCase + " lowercase letters");
        System.out.println((countNumbers + "numbers"));

        }
    }
