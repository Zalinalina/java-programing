package day40_ArrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();//Polymorphic way od declaring
        System.out.println(nums);// empty []
        System.out.println("size = " + nums.size());// size = 0

        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0);


        System.out.println("nums = "+ nums);


        nums.remove(0);
        System.out.println("nums = "+ nums);

       // nums.remove(88); - index 88 - IndexOutOfBounsException
        nums.remove(new Integer(88));
        System.out.println("nums = "+ nums);

        nums.remove(new Integer(5));
        System.out.println("nums = "+ nums);//remove just first 5

        //for loop - iterate trough all values and print
        for (int i = 0; i < nums.size(); i ++){
            System.out.print(nums.get(i) + " ");
        }
        System.out.println();
        //for each loop, and print all in same line
        for(int each : nums){
            System.out.print(each + " ");// for each loop automaticaly get
        }
    }

}
