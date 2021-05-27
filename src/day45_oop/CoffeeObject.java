package day45_oop;

public class CoffeeObject {
    public static void main(String[] args) {


        Coffee myCoffee = new Coffee();

        System.out.println("coffee amount " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("Amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(10);

        System.out.println("amount after drink 10 = " + myCoffee.getAmount());

        //myCoffee.type = "Turckish cofee";// imsted using a method

        myCoffee.setType("Turckish coffee");

        System.out.println("My coffee = " + myCoffee.getType());
//describe maCoffee - show all variable values
        System.out.println(myCoffee.toString());

        //Add another coffee object , set values, call methods
        // Stack             //heap
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");

        System.out.println("Coffee1 type = " + coffee1.getType());
       //assign coffee1 object to coffee2
       // hey java point coffee2 to same object as coffee1

        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");
        System.out.println("Coffee1 type = " + coffee1.getType());//Espresso
        System.out.println("coffee2 type = " + coffee2.getType());//Espresso

        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");

        coffee3 = coffee2;
        System.out.println("coffee3 type  = " + coffee3.getType());

        Coffee coffee4 = null;// reference variable());
        coffee4.setType("turkish");// NullPointerException


    }
}
