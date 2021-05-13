package day18_condotions_practice_string_intro;

public class Numbers3 {
    public static void main(String[] args) {


        int num1, num2, num3;
        num1 = 123;
        num2 = 100;
        num3 = 2000;

        if (num1 >=num2 && num1 >= num3) {
            System.out.println("the largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("the largest number is: " + num2);
        } else {
            // if (num3 > num1 && num3 > num2) ;wrong

            System.out.println("the largest number is: " + num3);
        }
    }

        }


