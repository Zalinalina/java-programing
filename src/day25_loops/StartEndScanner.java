package day25_loops;

import java.util.Scanner;

public class StartEndScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
       // int start =5;
       // int end =10;


        int start = scan.nextInt();
        int end = scan.nextInt();
        if (start > end ){
            System.out.println("Reverse numbering is not supported");
        }
        for(int i = start ; i <= end ; i++ ){//if false block will not run
            System.out.print(i +" ");
        }
    }
}
