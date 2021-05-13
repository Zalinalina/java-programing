package day37_methods_overloading;

import MyPracticeApril.Arrays;

public class OverloadMain {


    public static void main(String[] args) {//(String a(any different name) [] the same thing
        System.out.println("Hello From Real Main Method");
        main(10);
       //Arrays.toString(args);
    }
/*overloading main method :
same name + different parameters
JDK does not look for this one to run

 */

    public static void main(int num) {
        System.out.println("num = " + num);


    }
}