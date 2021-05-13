package MyPractice;

public class SaimsTasksPractice2 {
    public static void main(String[] args) {
        String word1 = "apple";
        System.out.println(word1.substring(1));
        String word2 = "banana";
        System.out.println(word2.substring(0, word2.length() - 1));


        String word3 = "sunny";
        if (word3.length() % 2 == 0) {
            System.out.println(word3.charAt(word3.length() / 2 - 1) + "" + (word3.charAt(word3.length() / 2)));
        } else {
            System.out.println(word3.charAt(word3.length() / 2));
        }
    }
}
/*

            Odd:

             apple
             01234
             p -> 2     5/2 -> 2

             dog
             012
             o -> 1      3/2 = 1

             even        4/2 = 2
             0123


            Odd:

             apple
             01234
             p -> 2     5/2 -> 2

             dog
             012
             o -> 1      3/2 = 1

             even        4/2 = 2
             0123
         */

      //  String word = "even";

      //  if (word.length() % 2 == 1) {
            // odd
         //   System.out.println(word.charAt(word.length() / 2));
        //    System.out.println(word.substring(word.length() / 2, word.length() / 2 + 1));
       // } else {
            // even
         //   int index = word.length() / 2;
         //   System.out.println(word.charAt(index - 1) + "" + word.charAt(index));
           // System.out.println(word.substring(index - 1, index + 1));
    //    }

 //   }

         /*

        String word = "even";

        if(word.length() % 2 == 1) {
            // odd
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2, word.length()/2 + 1));
        } else {
            // even
            int index = word.length()/2;
            System.out.println(word.charAt(index-1) + "" + word.charAt(index));
            System.out.println(word.substring(index-1, index+1));




    }

}


      */
