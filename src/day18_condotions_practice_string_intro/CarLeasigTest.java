package day18_condotions_practice_string_intro;

public class CarLeasigTest {
    public static void main(String[] args) {
        String Make = "Mercedes";
       int  leasePrice=0;
        String model = "A";

        //if(Make.equals("Mercedes") && model.equals("E")){
           // leasePrice = 500;
      //  }
       // else if (Make.equals("Mercedes") && model.equals("A")) {
          //  leasePrice = 400;
           // }

        if(Make.equals("Mercedes")){
            if (model.equals("E")) {
                leasePrice = 500;
            }else if (model.equals("A")) {
                leasePrice = 400;

            }
            }else{
                System.out.println("Invalid make");
                return;//exit program/ main method
            }

        System.out.println("Make = " + Make);
        System.out.println("model = " + model);
        System.out.println("leasePrice = " + leasePrice);
        }
    }

