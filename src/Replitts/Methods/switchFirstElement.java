package Replitts.Methods;
import java.util.*;

public class switchFirstElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
        Arrays.toString(do_switch(arr));
    }



    public static int[] do_switch(int[] i) {

        int temp = i[0];
        i[0] = i[i.length - 1];
        i[i.length - 1] = temp;

        System.out.println(Arrays.toString(i));

            return i;
        }
}