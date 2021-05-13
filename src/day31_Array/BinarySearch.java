package day31_Array;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        //             0   1    2    3     4       5
        int[] nums = {-5, 23, 123, 645, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums, 23));// 1 because index is 0
        System.out.println(Arrays.binarySearch(nums, 2344));//4
        System.out.println(Arrays.binarySearch(nums, 25));//-3
        System.out.println(Arrays.binarySearch(nums, 700));//-5
        System.out.println(Arrays.binarySearch(nums,-5));//0

//check if number 12345 is among numbers in array
        if(Arrays.binarySearch(nums,12345)>=0){
            System.out.println("12345 is present");
        }else{
            System.out.println("12345 is not present");
        }
    }
}