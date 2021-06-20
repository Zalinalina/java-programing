package day55_abstraction.exercize_example;

public abstract class Exersize {
    public void start() {//non-abstract method
        System.out.println("Warming up and starting the exercise");
    }
    /*
    abstract method - method without body/impl, just signature
    purpose: letting sub classes implement/override their own way
     */
    public abstract void perform();


    /**
     * another method that concrete sub classes will overide / implement
     * @param minutes - how long is exersize is performed
     * @return number of calories burned/used
     */
    public abstract int getCaloriesCount(int minutes);

    }

