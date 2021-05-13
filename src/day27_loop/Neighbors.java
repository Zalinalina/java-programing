package day27_loop;

public class Neighbors {
    public static void main(String[] args) {
        //             012345678
        String word = "jjjjjjjjjjjjaaaaaaaaaaaaaavvvvvvvvvvvaaaaaaaaaaaaaaaaa";

        for (int index = 0; index < word.length() - 1; index++) {
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index + 1));
            // if(word.contains(word.charAt(0) == ))


            if (word.charAt(index) == word.charAt(index + 1)) {
                System.out.println("beep - " + word.charAt(index));
            }
        }
    }
}