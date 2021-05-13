package MyPracticeApril;

import java.util.Scanner;

public class longest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();
        }
        //write your code below
        String longest="";
        for(String big : words){
            if (longest.length() < big.length()){
                 longest = big;
            }

        }
        System.out.println(longest);
    }
}



