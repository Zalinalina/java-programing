package ReplitArray;
import java.util.*;
public class shiftLeft {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i = 0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            //WRITE YOUR CODE HERE

            int temp = nums[0];
            for(int i = 0; i < nums.length-1; i++) {
                nums[i] = nums[i + 1];
            }
                nums[nums.length - 1] = temp;

                System.out.println(Arrays.toString(nums));

/*

        int[] numsArr = new int [size];
        for (int i =0; i < size - 1; i++){
            numsArr[i] = nums[i+1];

        }
        numsArr[size-1] = nums[0];
        System.out.println(Arrays.toString(numsArr));


 */
        }
    }


