package MyPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class mjPractice {
    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Andy", "Bart", "Carl", "Elmo"));
       // names.set(names.indexOf("Andy"), names.remove(2));
        names.set(3,"2");
        System.out.println(names);


    }
}