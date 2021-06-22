package day55_abstraction.exercize_example;

public class FreeWeight extends Lifting{

    @Override
    public void perform() {
        System.out.println("Lifting Free Weight dumbbells");

    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 15;
    }

    @Override
    public void endLift() {
        System.out.println("carefully re-rack dumbbells");

    }
}
