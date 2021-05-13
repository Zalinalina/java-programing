package day14_multy_branch_if_statements;

public class Calculator {
    public static void main(String[] args) {
        double num1 = 5.5;
        double num2 = 2.5;
        char operator = '+';

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Wrong operator-" + operator);
        }
    }
}