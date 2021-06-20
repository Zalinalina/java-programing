package day48_constructor_static;

public class Bus {
    day48_constructor_static.driver driver;
    day48_constructor_static.engine engine;

    public String toString() {
        return driver.getName() + " | " + engine.getCylinders();
    }
}
