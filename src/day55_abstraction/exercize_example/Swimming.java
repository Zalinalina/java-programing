package day55_abstraction.exercize_example;

public class Swimming extends Exersize{
    @Override
    public void perform() {
        System.out.println("Performing swimming in the pool or ocean");
    }


    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }
}
