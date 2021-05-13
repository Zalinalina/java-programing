package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 7;
        if (floorNum == 1) {
        System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
    } else if (floorNum == 2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsar");

    } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake House");
        }else{
            System.out.println("Invalid floor " + floorNum);
        }


        System.out.println("================Switch Statement ========================");

        floorNum =3;
        switch(floorNum) {
            case 1:  // same as if (floorNum == 1) {
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;// exit the switch statement
            case 2://else if (floorNum == 2){
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsar");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake House");
                break;
            default:
                System.out.println("Invalid floor " + floorNum);



        }
    }
}
