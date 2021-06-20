package day51_inheritance.super_keyword;

public class LiftRides {
    public static void main(String[] args) {
        Lift liftRide = new Lift();
        LiftXL liftXLRide = new LiftXL();
        Lux luxRide = new Lux();

        System.out.println("liftRide for 5 miles = $" +liftRide.calculateRate(5));
        System.out.println("liftXLRide for 5 miles = $" + liftXLRide.calculateRate(5));
        System.out.println("liftXLRide for 5 miles = $" + luxRide.calculateRate(5));
    }
}
