package MyPractice;

import java.util.Scanner;

public class prefix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        int n = scan.nextInt();

        String prefix = str1.substring(0,n);

        if(str1.substring(n).contains(prefix)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
