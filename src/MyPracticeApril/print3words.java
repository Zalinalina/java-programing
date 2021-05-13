package MyPracticeApril;

import java.util.*;

public class print3words {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE
        for(int j = 0; j  <arr.length-2; j++){

           System.out.print(arr[j]+ ", " + arr[j+1]+ ", " +arr[j+2]+"\n");
           // System.out.println(arr[j]);
        }

    }
}


