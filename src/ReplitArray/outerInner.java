package ReplitArray;
import java.util.*;
public class outerInner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeInner = scan.nextInt();
        int sizeOuter = scan.nextInt();
        int[] inner = new int[sizeInner];
        int[] outer = new int[sizeOuter];
        for (int i = 0; i < sizeInner; i++) {
            inner[i] = scan.nextInt();
        }
        for (int j = 0; j < sizeOuter; j++) {
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE

        for (int n = 0; n < inner.length; n++) {
            if (Arrays.binarySearch(outer, inner[n]) < 0) {
                System.out.println(false);
                break;
            } else if (n == inner.length - 1) {
            }
            System.out.println(true);


        }
    }
}