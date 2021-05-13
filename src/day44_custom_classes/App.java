package day44_custom_classes;

/**
 * App class is used as a template for App objects.
 * We are describing app properties and behavior here. Objects will be able to use them
 */
public class App {
    String name; //"Uber";
    double version; // 0.0;
    // open method using name  and version variables

    public void open() {
        System.out.println("opening " + name + " app - version = " + version);
    }
}



