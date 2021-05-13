package day23_String_manipulations_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        //int i = 1;
        // if (i <= 5) {
        //System.out.println(i);
        //i++;

        int i = 1;
        while (i <= 25) {
            System.out.println(i);
            i++;
        }
        //int apples = 0;
        //if (apples <=10) {
        //   System.out.println("apple -> "+apples);

        int apples = 0;
        while (apples <= 3) {
            System.out.println("apple -> " + apples);
            apples++;
        }
        System.out.println("apples = " + apples);


        //infinite loop
        if (true) {
            System.out.println("Hello World");

            while (true) {//condition is always true
                System.out.println("Hello World");
            }


        }
    }
}