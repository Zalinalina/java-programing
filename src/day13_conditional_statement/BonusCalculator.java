package day13_conditional_statement;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0.0;
        double salesAmount = 5000;
        if (salesAmount <= 2000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus = 50.0;// conditional value assignment
            // System.out.println("Your bonus is: S" + (salesAmount + 50));
        } else {
            System.out.println("Good job, you qualified for full bonus!");
            bonus = 100;
            // System.out.println("Your bonus is: $" + (salesAmount + 100));

        }
        System.out.println("Your total bonus: $" + bonus);

    }
}
