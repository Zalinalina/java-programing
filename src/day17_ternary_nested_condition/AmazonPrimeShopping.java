package day17_ternary_nested_condition;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        double itemPrice = 15.0;
        boolean isPrimemember = false;


        if (isPrimemember) {
            System.out.println("Eligible for 2 days free shipping");
        }else{
            if(itemPrice >= 25){
                System.out.println("Eligible for free regular shipping");
            }else {
                System.out.println("Not eligible for free shipping. fee is $10");


            }
        }

    }
}
