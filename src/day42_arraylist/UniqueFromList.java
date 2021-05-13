package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        //declare Integer arraylist with following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        System.out.println(nums);

        List<Integer> uniqueList = getUnoqueIntegers(nums);

        System.out.println("\nuniqueList = " + uniqueList);
    }

    public static List<Integer> getUnoqueIntegers(List<Integer> nums) {
        List <Integer> uniqueList = new ArrayList<>();
        //loop trough the list
        for (int each : nums){
            //check if number appears only one

           // System.out.print(each + "");

            if(Collections.frequency(nums, each) == 1){
                //print that number
                System.out.print(each + " ");
                uniqueList.add(each);

            }
        }
        return uniqueList;
    }
}
