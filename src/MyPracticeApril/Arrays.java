package MyPracticeApril;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            size += nums[i];
            System.out.print(nums[i]);
        }

    }
    }

