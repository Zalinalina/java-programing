package day44_custom_classes;

public class AnimalObject {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.type);//some animal
        animal.eat();
        animal.eat("grass");
        animal.speak();


        // create object cheetaObj
        Animal cheetahObj = new Animal();
        cheetahObj.type = "Cheetah";
        System.out.println(cheetahObj.type);// change value / reassign to "cheetah"
        cheetahObj.eat("meet");

    }
}
