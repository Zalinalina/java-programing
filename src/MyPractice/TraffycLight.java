package MyPractice;
public class TraffycLight {
    //[Street light]

    /*You are at a street line. The color of the street line will determine what you should do.

    Green light - Print "Go"
    Yellow light - Print "Slow down"
    Red light - Print "Stop"

     */
    public static void main(String[] args) {

        String lightColore = "Purple";
        if(lightColore.equals("Green")) {
            System.out.println("Go");
        }
        else if (lightColore.equals("Yellow")) {
            System.out.println("Slow down");
        }
        else if (lightColore.equals("Red")) {
            System.out.println("Stop");

        }else{
            System.out.println("Wrong colore");
        }


        }



    }



