package Replitts.Methods;

import java.util.*;
public class taskWordBadword {

    public static String clean(String text, String badWord) {

        String cleanText = text.replace(badWord, "").replace("  ", " ");



        return cleanText;

    }



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(clean(in.nextLine(), in.nextLine()));
        }

    }

