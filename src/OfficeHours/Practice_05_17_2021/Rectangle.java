package OfficeHours.Practice_05_17_2021;

public class Rectangle {
    double height;
    double width;
    double area;

    public void setDementions(double recHeight, double recWidth) {
        width =  recWidth;
        height =  recHeight;


    }
    public double getArea(){
        area =  height *  width;
       return area;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", area=" + area +
                '}';
    }
}
