package day51_inheritance.super_keyword;

public class Lux  extends Lift{
    @Override
    public double calculateRate(double miles){
        //calculateRate of Lift + 20 percent
        return super.calculateRate(miles) * 1.2;


    }
}
