package day35_methods_with_parameters;

import java.util.*;

public class MultipleParams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 doubles:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();
        showSum(d1,d2);

        showSum(5.5, 10.1);//folow by ,
    }
    public static void showSum(double num1 , double num2){
        double sum = num1 +num2;//folow by coma
        System.out.println("The sum = " + sum);
    }
}
