package day31_Array;

public class charArrays {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's',' ', 'f', 'u', 'n'};

        for (char each : letters) {


            System.out.print(each + " ");


        }
        String sentence = new String((letters));
        System.out.println("\nsentece = " + sentence);
    }
}