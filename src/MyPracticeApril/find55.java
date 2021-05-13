package MyPracticeApril;
import java.util.*;
public class find55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:
        //  int number =0;
       // for (int i = 0; i < nums.length - 2; i++) {
          //  if (nums[i] == 5 && nums[i + 1] == 5) {
              //  System.out.println(true);
//return;

      //  }
   // }
       // System.out.println(false);



        // another way
        boolean trueOrFalse = false;
        for (int i = 0; i <= nums.length-2; i++){
            if(nums[i]==5 && nums[i+1]==5){
                trueOrFalse=true;
                break;

            }
        }
        System.out.println(trueOrFalse);
}
}











