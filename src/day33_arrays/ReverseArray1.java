package day33_arrays;
import java.util.*;
public class ReverseArray1 {
    public static void main(String[] args) {

        int[] nums = {5, 10, 4, 100};
        int[] numsRev = new int[nums.length]; //0000

        // i =3 , j =0

        for (int i = nums.length - 1 , j=0; i >= 0; i-- , j++) {
           // System.out.println(nums[i] + "");
            numsRev[j] = nums[i];

        }
        System.out.println(Arrays.toString( nums));
        System.out.println(Arrays.toString(numsRev));
    }
}