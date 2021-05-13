package MyPractice;

import java.util.Scanner;

public class breadbread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int starts = str.indexOf("bread");
        int ends = str.lastIndexOf("bread");

        if(starts != ends){
            System.out.println(str.substring(starts+5, ends));
        }else{
            System.out.println("nothing");
        }



    }
}






