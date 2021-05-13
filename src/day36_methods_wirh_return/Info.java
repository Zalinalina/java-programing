package day36_methods_wirh_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
       // fullname();// mike Smith
        System.out.println("Full name = " + fullname());// print 2 times because we call it 2 times
        System.out.println("isMarried = " +isMarried());
        System.out.println(("age = "+ getAge()));
        System.out.println("Birth year = " + getRandomYear());// dinamic different year each time

        if(isMarried()) {
            System.out.println("married");
        }else{
            System.out.println("single");
        }


        String name = fullname();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }

    public static String fullname() {
      //  System.out.println("inside full name method");
        return "Mike Smith" ;
       // System.out.println("Mike Smith"); ERROR
    }
    public static boolean isMarried() {
        return false;
    }

    public static int getAge() {
        int age =35;//declaire variable or return 35;
    return age;
    }

    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}


