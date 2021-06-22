package OfficeHours.Practice_06_14_2021;

public class CandyFactory {
    public static void main(String[] args) {
        Candy candy = new Candy("generic", 10, true);
        System.out.println(candy);

        take5 barOne = new take5(4, true);
        System.out.println(barOne);

        Twix barTwo = new Twix(2,false);
        System.out.println(barTwo);
    }

}
