package MyPracticeApril;
import java.util.*;
import java.util.Arrays;
public class ArrayReplitReverse {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            //TODO: write your code below

            for(int i = 0; i <nums.length/2; i++ ) {
                nums[nums.length - 1 - i] = nums[0 + 1];


            }

        //Do not change below statement:
        System.out.println(Arrays.toString(nums));

    }
}


