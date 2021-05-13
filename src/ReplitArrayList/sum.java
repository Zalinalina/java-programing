package ReplitArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(in.nextInt());
        }
        int sum = 0;
        for (int j = 0; j < list.size(); j++) {

            // Write your code below
            sum += list.get(j) ;


        }
        System.out.println(sum);
    }
}
