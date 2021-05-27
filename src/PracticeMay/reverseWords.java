package PracticeMay;

public class reverseWords {
    public static void main(String[] args) {
        reverse("apple banana kiwi");
    }


    public static void reverse(String revWord) {
        String [] words = revWord.split(" ");
        String revString = "";
        for(int i = words.length-1; i >= 0; i--){
            revString += words[i] + " ";

        }

        System.out.println(revString);

    }

}
