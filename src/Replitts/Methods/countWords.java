package Replitts.Methods;

import java.util.*;
public class countWords {


        public static int wordCount(String words) {
            // your code
            int count = 0;
            for (int i = 1; i < words.length(); i++) {
                if (words.charAt(i) == ' ') {
                    count++;

                }
            }
            return count;
        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(wordCount(in.nextLine()));

        }

    }



