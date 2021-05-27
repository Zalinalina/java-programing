package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        ChekingAccount acc = new ChekingAccount();
        acc.setAccountNumber(43124569878521L);
        acc.setBalance(250.50);
        acc.setAccountHolder("Adam Smith");
        acc.setType("360 Checking");

        System.out.println("acc = " + acc);


        ChekingAccount bank = new ChekingAccount();
        bank.setAccountInfo(23456987456l, "Peter Don", 450298, "saving account");
        System.out.println(bank);
    }

}
