package day12_conditional_statements;

public class IFElseStatement {
    public static void main(String[] args) {
        if (10> 5) {
            System.out.println("Condition is true");
        }else {
            System.out.println("Failed the exam");
        }

        int count = 25;
        if (count > 30) {
            System.out.println(" count is more than 30");
        }else {
            System.out.println("count is less then 30");
        }

        byte age = 14;
        if (age >=18) {
            System.out.println("Eligible to vote: ");
            System.out.println("age is greater or equal to 18");
        }else {
            System.out.println("Not eligible to vote");
            System.out.println("age is less than 18");
        }

    }
}
