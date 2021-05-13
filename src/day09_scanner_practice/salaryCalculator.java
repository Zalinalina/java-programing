package day09_scanner_practice;
import java.util.Scanner;
public class salaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hours of work in a week: ");
        double hourlyRate = 60;
        double weeklyPay = hourlyRate *40;
        double monthlyPay =weeklyPay *52 /12;//weeklyPay *4 as well correct
        double annualPay = monthlyPay * 12;
        System.out.println("hWeekly pay: "+ weeklyPay);
        System.out.println("Monthly pay: "+monthlyPay);
        System.out.println("annualPay: " + annualPay);
    }
}
