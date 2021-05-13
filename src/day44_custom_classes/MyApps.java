package day44_custom_classes;

/**
 * this class uses to create objects
 */
public class MyApps {
    public static void main(String[] args) {
     //   String app = "uber";
      //  System.out.println("app = " + app);
        App uberApp = new App();
        // opening Uber app - version = 3.5
        uberApp.name = "Uber";
        uberApp.version = 3.5;
        uberApp.open();//call open method using object variable

        uberApp.version = 4.0;
        uberApp.open();// only this will change
        System.out.println();
    }
}
