package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "Anna";
      //  System.out.println(word.charAt(3)+""+word.charAt(2)+""+word.charAt(1)+""+word.charAt(0));

      //  System.out.print(word.charAt(3));
       // System.out.print(word.charAt(2));
       // System.out.print(word.charAt(1));
       // System.out.println(word.charAt(0));
       // System.out.println(word);

        System.out.println(""+word.charAt(3)+word.charAt(2)+word.charAt(1)
                           +word.charAt(0));//right way

        String reverse = ""+word.charAt(3)+word.charAt(2)+word.charAt(1)
                +word.charAt(0);

        System.out.println("word = " + word);
        System.out.println("word2 = " + reverse);


        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("Palindrome word");
        }else{
            System.out.println("Not palindrome word");
        }

    }
}
