package day21_String_manipulation;

public class StringChatAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word + "-" + word.length());//4

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt((1)));//0l-C,1-y,2-b...
        char first = company.charAt(0);
        System.out.println(first);
        char second =company.charAt(1);
        char third = company.charAt(2);
        char forth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);
        System.out.println(first + "-"+ second + "-"+ third + "-" + forth +"-" +fifth + "-" +sixth + "-"
                +seventh+ "-"+eighth);
        System.out.println("");

        String withSpaces = first + "-"+ second + "-"+ third + "-" + forth +"-" +fifth + "-" +sixth + "-"
                +seventh+ "-"+eighth;
        System.out.println("withSpaces = " + withSpaces);

        String word2 = "mom";

        char ffirst = word2.charAt(0);
        char last = word2.charAt(2);
        if (ffirst == last) {
            System.out.println("first and last letter match");
        }else{
            System.out.println("first and last letter mismatch");
        }


        if(word2.charAt(0) == word2.charAt(2));//the same


        String anotherWord = "level";
        char firstLetter = anotherWord.charAt(0);
        int count = anotherWord.length();
        //count--
        //char lastLetter =anotherWord.charAt(count - 1);
        char lastLetter = anotherWord.charAt(anotherWord.length() -1);


        System.out.println(firstLetter);
        System.out.println(lastLetter);
        if (firstLetter == lastLetter) {
            System.out.println(anotherWord + " first and last match");
        }else{
            System.out.println("first and last mismatch");
        }


        String word1 = "Zalina";
        System.out.println(word1.charAt(0));
        System.out.println(word1.charAt(1));
        System.out.println(word1.charAt(2));
        System.out.println(word1.charAt(3));
        System.out.println(word1.charAt(4));
        System.out.println(word1.charAt(5));
        //System.out.println(word.charAt(6));//error

    }
}
