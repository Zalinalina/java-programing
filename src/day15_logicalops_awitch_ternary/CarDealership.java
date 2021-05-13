package day15_logicalops_awitch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget = 5000.0;
       double carPrice = 8500.0;
       String model = "Tesla";
      if (carPrice <= budget && (model.equals("Toyota")||model.equals("Honda")|| model.equals("Tesla"))){
          System.out.println("Ready to purchase model = " + model+ ", price = "+ carPrice);
      }else{
          System.out.println("Not interested in model = " + model+ ", price = "+ carPrice);
      }
    }
}
