package day51_inheritance.super_keyword;

public class LiftXL extends  Lift{

    @Override
    public double calculateRate(double miles){
        return super.calculateRate(miles) *1.1;
    }

}
