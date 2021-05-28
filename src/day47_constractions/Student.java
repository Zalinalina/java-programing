package day47_constractions;

public class Student {

    public Student() {
        System.out.println("No - Args constructor");


    }

    //constructor with param: String name
    public Student(String name) {
        //public Student(String name, int age, String type){

        System.out.println("name param constructor | name = " + name);
        // System.out.println("name param constructor | name = " + name +" " + age + " "+ type);
    }

    public Student(int age) {
        System.out.println("age param constructor | age = " + age);
    }

    public Student(String name, int age) {
        System.out.println("name & age param constructor | name  = " + name + "| age = " + age);
    }
}