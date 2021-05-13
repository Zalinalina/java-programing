package OfficeHours.Practice_05_12_2021;

public class BankAccount {
    //public static void main(String[] args) {
    String accountHolderName;
    int pin;
    double balance;
    long accountNumber;

    public double getBalance(int inputPin) {
        if (pin == inputPin){
            return  balance;
        }
        return -1;
    }


    }

