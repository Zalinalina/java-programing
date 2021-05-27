package day45_oop;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create traffic ligt object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; //not this way
        //we will assighn / update the value of colorw using a mrthod of the class
        trafficLight.changeColor("red");
        //System.out.println("current color = " + trafficLight.color);
        //Dirrect access to variavle. Not recomended

        //call method to access the variable

        trafficLight.showColor();

        trafficLight.changeColor("green");
        trafficLight.showColor();


        TrafficLight trafficLight2 = new TrafficLight();
      //  trafficLight2.color = "black";
        trafficLight.changeColor("blue");
        trafficLight2.showColor();
    }
}
