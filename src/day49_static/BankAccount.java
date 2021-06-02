package day49_static;

public class BankAccount {
    static double balance = 500.0;
    String user;

    public void spend(double amount) {
        System.out.println(user + " is spending $" + amount );
        balance -= amount;

    }
    public void showbalance (){
        System.out.println("Current balance = " + balance);
    }
}
