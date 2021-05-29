package day48_constructor_static;

public class Ingine {

   private int cylinders;

    @Override
    public String toString() {
        return "Ingine{" +
                "cylinders=" + cylinders +
                '}';
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
