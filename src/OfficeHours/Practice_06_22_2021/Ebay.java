package OfficeHours.Practice_06_22_2021;

//Create a concrete class Ebay
//- Inherit OnlineShopping and implement all abstract methods

public class Ebay extends OnlineShopping{

    @Override
    public void viewCart() {
        System.out.println("Viewing Ebay cart");

    }

    @Override
    public boolean payForShipping(double price) {
        return price<100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from Ebay");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning to Ebay");

    }
}
