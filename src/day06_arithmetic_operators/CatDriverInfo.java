package day06_arithmetic_operators;

public class CatDriverInfo {
    public static void main(String[] args){
        //String carModel = "BMW x6";
        String carModel = "Jeep Wrangler";
        String driverName = "Batman";
        String licenseNumber = "letsMakeJavaGreatAgain12345 ";
        short speed = 80;
        boolean isItAutomatic = true;
        char licenseClass = 'D';



        System.out.println("Car model:\t\t"+ carModel);
        System.out.println(carModel + " is car model.");
        System.out.println("Driver name: "+ driverName );
        System.out.println(driverName + " is driving a car");
        System.out.println(driverName + " is driving " + carModel);
        System.out.println(driverName);
        System.out.println(" Current speed is: " + speed);
        System.out.println(" Current speed is: " + speed + " mph");
        System.out.println("Is car automatic -> " + isItAutomatic);
        System.out.println(licenseClass +" " + isItAutomatic);
        System.out.println(licenseClass +" - " +  isItAutomatic);



       //  driverName LicenseNum speed automatic

    }
}
