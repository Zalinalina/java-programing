package day46_encapsulation;

public class Car {
    //encapsulated hidden ynstance variables
    private String model;
    private int year;
    private int mileage;

    //setter method for model
    public void setModel(String carModel) {
        model = carModel;


    }

    // getter method for model
    public String getModel() {
        return model;

    }

    //setter for year
    public void setYear(int year) {
        this.year = year;
    }

    //getter for year
    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;//this.mileage works as well

    }
    //get setter for mileage

    public void setMileage(int mileage) {
        this.mileage = mileage;
}

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
