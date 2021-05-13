package day36_methods_wirh_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(5.2, 20.0));
        double sum = add(1, 3);
        System.out.println("sum = " + sum);
        System.out.println("100 + 200 = " + add(100, 200));


        System.out.println(minus(25, 17));

        System.out.println(multiply(10, 3));

        System.out.println(devide(16, 4));

        //System.out.println(minus(2.2,4.5));
    }

    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum; // or return num1 + num2

    }

    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;

    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;

    }

    public static double devide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}