package OfficeHours.Practice_06_05_2021;

public class Item {

    //Create a class Item
    //
    //    -> Instance variables:
    //        - name (String), price (double), quantity (int)
    //
    //    -> Constructor:
    //        - Accepts and initializes all three variables
    //
    //    -> Instance methods:
    //        - toString(): returns information about Item

   String name;
   double price;
   int quantity;

   public Item(String name, double price, int quantity) {
       this.name = name;
       this.price = price;
       this.quantity = quantity;
   }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

