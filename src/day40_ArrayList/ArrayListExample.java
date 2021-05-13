package day40_ArrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
        // nums.add("java); Error


        System.out.println("size = "+nums.size());

     //reding from arraylist
        System.out.println("index 0 = "+ nums.get(0));
        System.out.println("index 1 = "+ nums.get(1));
        System.out.println("index 2 = "+ nums.get(2));

        //System.out.println("index 3 = "+ nums.get(3));indeOfoutOfBound

        //print all values in the same line
        System.out.println(nums);//Arrays.toString(numArray);  for String Array

        //remove element at index 1
        nums.remove(1);
        System.out.println(nums);
    }
}
