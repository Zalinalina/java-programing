package OfficeHours.Practice_03_24_2021;

import javax.swing.text.ViewFactory;

public class AccountNumber {
    public static void main(String[] args) {
        String accountNumber = "5678909";
        if (accountNumber.startsWith("2")) {// if(accountNumber.charAt()=='2';

            if (accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number");
            } else {
                System.out.println("Not valid 7 digit account number");
            }


        } else if (accountNumber.startsWith("5")) {


            if (accountNumber.length() == 10) {
                System.out.println("Valid 10 digit account number");
            } else {
                System.out.println("Not valid 10 digit account number");
            }

        } else {
            System.out.println("Not valid account number");
            }
        }
    }
