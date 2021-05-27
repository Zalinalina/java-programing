package day45_oop;

public class TrafficLight {

    String color;
// thius is read only methods, displays value of color variabl

    public void showColor() {
        System.out.println("current color = " + color);


    }
    //this method updates the value of color variable
    public void changeColor(String newColor) {

        if (newColor.equalsIgnoreCase("red") || newColor.equalsIgnoreCase("yellow") ||
                newColor.equalsIgnoreCase("green")){
        System.out.println("Changing color to " + newColor);
    }else{
            System.out.println("ERROR: invalid color: " + newColor);
        }



       // System.out.println("current color to  " + newColor);
       // color = newColor;
    }
}
