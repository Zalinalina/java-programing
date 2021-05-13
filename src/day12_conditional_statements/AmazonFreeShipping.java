package day12_conditional_statements;
import java.util.Scanner;
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price:");
        double totalPrice = scan.nextDouble();
        if(totalPrice >=25) {
            System.out.println("Eligible for free shipping $"+totalPrice);
        }else{
            System.out.println("Not eligible for free shipping. Your order total: $"+ totalPrice);

        }
        System.out.println("Thanks for shopping with Amazon.");
    }
}
