package MyPracticeApril;
import java.util.*;
import java.util.Arrays;

public class printFirstTwo {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    int size = scan.nextInt();
    int[] num = new int[size];
		for(int i =0; i < size; i++) {
        num[i] = scan.nextInt();
    }
    //WRITE YOUR CODE HERE
        /*
    int[] num1;
  if(size >=2) {
      num1 = new int[] {num[0], num[1]};
  }else {
      num1 = new int[]{num[0]};
  }
      System.out.println(Arrays.toString(num1));


         */
        int[] newArr= (size>=2) ? new int[] {num[0], num[1]} : new int[] { num [0]};
        System.out.println(Arrays.toString(newArr));

    }
}

