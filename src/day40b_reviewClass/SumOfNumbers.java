package day40b_reviewClass;

public class SumOfNumbers {
    /*
    [Sum of Numbers from String]

    Create a method that will accept a String and returns the sum of all the numbers in the String.

            Requirement: any numbers that are next to each other are not single digit numbers but instead read as a full number
    Ex: a5bc12def100g
    Here we would have added 5 + 12 + 100
    NOT: 5 + 1 + 2 + 1 + 0 + 0


     */

    public static void main(String[] args) {
        System.out.println(getSomFromString("a5bc12def100"));
    }

    public static int getSomFromString(String str) {
        int sum = 0;
        String num = "";//5
        for (int i = 0; i < str.length(); i++) {
            // str.charAt(i);
            if (Character.isDigit(str.charAt(i))) {//check if every character is a number (digit)
                num += str.charAt(i);

                if (i == str.length()-1||!Character.isDigit(str.charAt(i + 1))) {

                    sum  += Integer.parseInt(num);
                    num = ""; //resets our string for a number
                }
            }
        }
        return sum;
    }
}