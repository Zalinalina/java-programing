package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
BankAccount husband = new BankAccount();
husband.user = "husband";
husband.showbalance();
husband.spend(100.0);
husband.showbalance();

BankAccount wife = new BankAccount();
wife.user = "wife";
wife.showbalance();
    }
}
