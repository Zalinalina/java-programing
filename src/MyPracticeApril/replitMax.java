package MyPracticeApril;

import java.util.Scanner;

public class replitMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.

       int max = nums[0];
        //int max = 0;
        for (int each = 1; each < nums.length; each++) {//EACH =0
            if (max < nums[each]) {
                max = nums[each];

            }

        }
        System.out.println(max);
    }

}

