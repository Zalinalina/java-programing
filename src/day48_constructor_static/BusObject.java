package day48_constructor_static;


public class BusObject {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.driver = new driver("Abbas");
        bus.engine = new engine(10);

        System.out.println(bus.toString());


        Bus metroBus = new Bus();
        metroBus.driver = new driver("Aziz");
        metroBus.engine = new engine(15);

        System.out.println(metroBus);


        System.out.println(metroBus);
    }
}
