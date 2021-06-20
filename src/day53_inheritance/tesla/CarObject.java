package day53_inheritance.tesla;

public class CarObject {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar("Tesla", "Model Y" , 48190.0, 2021, 326);
        electricCar.drive(50);
        System.out.println(electricCar.toString());
      ///  System.out.println(electricCar.make);// error make is privet
       // System.out.println(ElectricCar.make);//error make need to be public static
        System.out.println("electricCar make = " + electricCar.getMake());
        System.out.println("electricCar model = " + electricCar.getModel());
        System.out.println("electricCar price = " + electricCar.getPrice());
        System.out.println("electricCar year = " + electricCar.getYear());
        System.out.println("electricCar range = " + electricCar.getRange());

        if (electricCar.getPrice() > 10000) {
            System.out.println(electricCar.getMake() +" - "+electricCar.getModel() +" is out of my budget");
        } else {
            System.out.println("purchasing " + electricCar.toString());
        }
        System.out.println(ElectricCar.getCount());

        ElectricCar electricCar2 = new ElectricCar("Tesla", "CyberTruck", 59900, 2022, 300);
        System.out.println(electricCar2.toString());

        System.out.println("Count = " + electricCar2.getCount());
        System.out.println("Count = " + ElectricCar.getCount());

        Roadster roadster = new Roadster("Roadster", 200000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster.getCount());//static method is inherited

        ModelX maModelX = new ModelX("Tesla", "Model X", 89990.0, 2021, 360);
        System.out.println("having lunch ...");
        maModelX.drive(10);
        System.out.println("Range remaining = " + maModelX.getRange());
        System.out.println("Total electric cars count = " + ElectricCar.getCount());


        }
    }

