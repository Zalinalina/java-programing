package day16_switch_ternary;

public class CappucinoBuyer {
    public static void main(String[] args) {
        String size = "Tall";
        double price= 0.0;
        int calories=0 ;

        System.out.println("Total price:");

        //when size = "tall"
        //    print "Tall Cappuccino please"
        //    price    ->  3.69
        //    calories ->  90
        //
        //when size = "grade"
        //    print "Grande Cappuccino please"
        //    price    ->  3.99
        //    calories ->  120
        //
        //when size = "venti"
        //    print "Venti Cappuccino please"
        //    price    ->  4.29
        //    calories ->  150
        //
        //any other size:
        //    print "We do'nt serve that size of Cappuccino"
        //
        //
        //print "Total price: $3.69"
        //      "You will consume 90 cal of energy"



        //if(size.eguals("tall")){
        switch(size){
            case "Tall":
                System.out.println("Tall Cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "Grande":
                System.out.println("Grande Cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "Venti":
                System.out.println("Venti Cappuccino please");
                price = 4.20;
                calories = 150;
                break;
            default:
                System.out.println("We dont serve that" +size+ "of Cappuccino");
                break;// optional

        }
            System.out.println("Total price: $" + price);
            System.out.println("You will consume " + calories+ " cal of energy");
    }
}
