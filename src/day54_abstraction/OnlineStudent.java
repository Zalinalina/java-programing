package day54_abstraction;

public class OnlineStudent extends Student {
    /*
    online student class will extens Student class

    attendClass abstract method is implemented by the sub class
    Sub class is overriding the abstract method of Parent class
     */
    @Override
    public void attendClass() {
        System.out.println("Online student is attending the class using Zoom");

    }
   // public abstract void ask(); abstract method cannot be in
}
