package day31_Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraysUtil {
    public static void main(String[] args) {
        int[]nums = {100, 5, 1, 7, 0, -4, 44, 33};
        // print all nums in the same line
        System.out.println(Arrays.toString(nums));

        //sort numbers
       Arrays.sort(nums);
       //print after sorting
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " +nums[0]);
        System.out.println("max value: " +nums[nums.length-1]);

       // Arrays.sort(nums, Collections.reverseOrder());


        String[] words = {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("[" + String.join(", ", words)+ "]");
        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));


        // sort words in reverse order
        Arrays.sort(words,Collections.reverseOrder());

        System.out.println(Arrays.toString(words));
    }
}
