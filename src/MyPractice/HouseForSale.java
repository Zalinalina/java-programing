package MyPractice;

public class HouseForSale {
    public static void main(String[] args){
        String houseType = "Townhouse";
        char numberOfBedrooms = 51;
        char numberOfBathrooms = 50;
        byte numberOfKitchens = 2;
        boolean isThereABasement = true;
        boolean isThereAnAttic = true;
        boolean isThereAPool = false;
        boolean isTheHouseForSale = true;
        double price = 485000;
        String address = "1707 District Ave, Fairfax, Va ";
        short zipcode = 22031;
        boolean parkNearBy = true;
        int rating = 5;

        System.out.println("House type:\t\t\t\t\t\t\t\t\t" +houseType);
        System.out.println("The number of bedrooms:\t\t\t\t\t\t"+numberOfBedrooms);
        System.out.println("The number of bathrooms: \t\t\t\t\t"+numberOfBathrooms);
        System.out.println("The number of kitchens:\t\t\t\t\t\t"+numberOfKitchens );
        System.out.println("The house has a basement:\t\t\t\t\t" +isThereABasement);
        System.out.println("The house has an attic:\t\t\t\t\t\t"+isThereAnAttic );
        System.out.println("The house has a pool:\t\t\t\t\t\t"+isThereAPool);
        System.out.println("The house is for sale:\t\t\t\t\t\t"  +isTheHouseForSale);
        System.out.println("Price fot the house:\t\t\t\t\t\t$" +price);
        System.out.println("Address for the house:\t\t\t\t\t\t" +address);
        System.out.println("Zipcode:\t\t\t\t\t\t\t\t\t" + zipcode);
        System.out.println("Park near the house:\t\t\t\t\t\t" +parkNearBy);
        System.out.println("Rating of surrounding school districts:\t\t" +rating);



    }
}
