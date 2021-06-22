package OfficeHours.Practice_06_14_2021;

public class Candy {

    /**Create a class Candy [Parent class]

     * instance variables:
     - brand (String), quantity (int), contains peanuts (boolean),

     * static variables:
     - number of total candy (int)

     * constructor to set all variables
     - Also increments total candy every time an object is made

     * encapsulate
     - Add one set of logic for quantity [ given number cannot be less than 0, otherwise it is not assigned]

     * override toString




     Create a class Twix [Child class]

     * Inherits Candy class

     * constructor that invokes the parent constructor

     * extra: static hiding, final, sub class

     Create a class CandyFactory [ No inheritance with Candy classes ]

     This class is to create objects of Candy, Take5, Twix and see how they are working

     **/


   private String  brand;
   private  int quality;
   private boolean hasPeanuts;
   private static int totalNumOfCandies;// purpose to knnow how many total Candy objects were made

   public Candy(String brand, int quality, boolean hasPeanuts){
       this.brand = brand;
       setQuality(quality);
       this.hasPeanuts = hasPeanuts;

       totalNumOfCandies++;
   }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
       if (quality > 0) {

           this.quality = quality;
       }
    }

    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }

    public static int getTotalNumOfCandies() {
        return totalNumOfCandies;
    }

    public static void setTotalNumOfCandies(int totalNumOfCandies) {
        Candy.totalNumOfCandies = totalNumOfCandies;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quality=" + quality +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
