package MyPracticeApril;
import java.util.Scanner;
public class evenArray {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

            //TODO: Write your code below
            int count =0;
            for(int eachNum:nums){
                if (eachNum % 2 == 0){
                    count++;

                }
            }
            System.out.println(count);
        }
    }

