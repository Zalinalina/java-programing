package day35_methods_with_parameters;

public class MethodsWithInputs {
    public static void main(String[] args) {
        dispayValue(1);
        dispayValue(94);
        dispayValue(3);
        int count = 55;
        dispayValue(count);

        greetByName("Saim");
        greetByName("Nadir");
        String name = "Suleyman";
        greetByName(name);
    }

    public static void dispayValue(int num) {
        System.out.println(("Value is " + num));

    }

    public static void greetByName(String name) {
        // String name ="@param/input";
        System.out.println("Hello " + name + ", how are you today?");

    }

}