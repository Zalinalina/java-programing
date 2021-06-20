package day50_inheritance.overridingExample;

public class Dog extends Animal {

    public void run() {
        System.out.println("cat is running");


    }

    @Override
    public void speak() {
        System.out.println("Dog is saying Woof");
    }
}
