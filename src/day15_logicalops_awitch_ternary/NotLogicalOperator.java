package day15_logicalops_awitch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        int apples = 10;
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can seat in passanger seat. age = " + age);
        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit. ");
        } else {
            System.out.println("This area is for smoking");
        }


        boolean isAffordable = false;
        if (!isAffordable) {
            System.out.println("Item not affordable");
        }
        String env = "qa";
        if (!env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");
        }
        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you!");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }
        if (!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }
        if (inputPassword.equals("abc321")) {
            System.out.println("Correct password");
        } else {
            System.out.println("Incorrect password");
        }
    }
}