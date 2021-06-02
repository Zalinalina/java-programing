package day49_static;

public class StaticTest {
    public static void main(String[] args) {
        //1) SM can only be called using classname
        StaticMethods.displayMessage("Wodden spoon");
        //1) instance method needs object to be called
        //StaticMethods.instanceMethod();//error
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();

        //2) static method can only access other static variables and methods
    }
}
