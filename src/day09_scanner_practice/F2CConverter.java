package day09_scanner_practice;
import java.util.Scanner;
public class F2CConverter {
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
        System.out.println("######### Fahrenheit to Celcius converter program #########");
        System.out.println("Enter Fahrenheit: ");
        double F = input.nextDouble();
        double CelciusValue = ((F-32) * 5/9);
        //System.out.println(CelciusValue + " Temperature in Celcius ");
        System.out.println(F + "F in C: " + CelciusValue);
    }
}
