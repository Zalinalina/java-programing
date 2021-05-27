package OfficeHours.Practice_05_20_2021;

public class MyBackYard {
    public static void main(String[] args) {

        Birds birdOne = new Birds();
        Birds birdTwo = new Birds();

        birdOne.setCanFly(true);

        System.out.println(birdTwo.isCanFly());
        birdTwo.setBeakLength(-1);
        System.out.println(birdTwo.getBeakLength());
    }
}
