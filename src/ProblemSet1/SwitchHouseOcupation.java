package ProblemSet1;

public class SwitchHouseOcupation {
    public static void main(String[] args) {
        String houseType = "Tree house";
        int maxOcupants =0;
        switch(houseType){
            case "Tree house":
                maxOcupants= 1;
                //break;
            case "Mobile home":
                maxOcupants=2;
                //break;
            case "Apartment":
                maxOcupants=4;
                //break;
            case "Town house":
                maxOcupants=6;
               // break;
            case "Villa":
                maxOcupants=8;
               // break;
            case"Mansion":
                maxOcupants=10;
                //break;
            default:
                System.out.println("Wrong house type");


        }
        System.out.println("The house type is: " + houseType + ". Maximum occupants is: " +maxOcupants + ".") ;

    }
}
