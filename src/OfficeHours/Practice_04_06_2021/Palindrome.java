package OfficeHours.Practice_04_06_2021;

public class Palindrome {
    public static void main(String[] args) {

        boolean isPalindrome = true;
        String word = "java";
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1-i)) { //n != a
               isPalindrome = false;
                break;
            }

            }

        System.out.println(isPalindrome);
        }

    }