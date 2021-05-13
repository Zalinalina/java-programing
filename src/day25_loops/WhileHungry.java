package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean hungry = true;
        int bananas = 0;
        int countToFull = 2;
//while(hungry &&  bananas != countToFull)
        while(hungry){
           // bananas = 1;
            bananas++;



                System.out.println("Eating a banana: \uD83C\uDF4C"+bananas);
                hungry=bananas==countToFull? false: true;
            //if (bananas==countToFull){
              // hungry = false;

            }
        System.out.println("Had enough bananas, lets get back to studying");
        }

    }

