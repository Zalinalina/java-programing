package MyPracticeApril;
import  java.util.Scanner;
public class SumArray { public static void main(String[] args) {
//[1, 2, 3,4, 5]
    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
    // DO NOT TOUCH ABOVE
    //TODO: Write your code below
    int sum = 0;
    for (int eachNum : nums) {
        sum += eachNum;//sum = sum + eachNum

    }
    System.out.println(sum);



    int[] numss = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
    // DO NOT TOUCH ABOVE
    //TODO: Write your code below.

    int max = numss[0];
    //int max = 0;
    for(int each: numss){

        if(max < numss[each]){
            max = numss[each];
        }

    }
    System.out.println(max);
}

}
