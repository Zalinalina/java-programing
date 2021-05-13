package MyPracticeApril;

import java.util.*;

public class words4lines {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++)
        {
            arr[i] = input.nextLine();
        }

        // DO NOT TOUCH ABOVE
        for(int j= 0; j<arr.length-1;j+=2){

            System.out.print(arr[j] +", "+ arr[j+1] +"\n" );
        }

    }
}


