package OfficeHours.Practice_04_21_2021;

public class Palindrom2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234321));
    }

    public static boolean isPalindrome(int number) {
        // System.out.println(number % 10);
        int reverse = 0;
        int temp = number;//1234
        while (temp != 0) {

            int lastDigit = temp % 10; //4
            reverse = (reverse*10) + lastDigit;
            temp /= 10;
            System.out.println(reverse);

        }
        return reverse == number;
    }

}



