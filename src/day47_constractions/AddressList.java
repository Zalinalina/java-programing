package day47_constractions;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress = new Address();
        cybertekAddress.setStreet("7920 Jones Branch Dr Suite 3300");
        cybertekAddress.setCity("Mclean");
        cybertekAddress.setState("VA");
        cybertekAddress.setZipCode("22182");

        System.out.println("CybertekSchool address: " + cybertekAddress.toString());//toString optional
        cybertekAddress.setStreet("7925 Jones Branch Dr Suite 3200");

        System.out.println("address after update = " + cybertekAddress);
        System.out.println("street info = "+ cybertekAddress.getStreet());

        Address newAddress = new Address();
        newAddress.setStreet("7921 Jones branch dr Suite 200");
        newAddress.setCity("Mclean");
        newAddress.setState("Va");
        newAddress.setZipCode("22102");
        System.out.println(newAddress.toString());


        Address papaJon = new Address("8500 Tico Rd Ste 1A", "Vienna", "VA", "22182");
        System.out.println("Papa John Pizza = "+ papaJon.toString());

    }
}
