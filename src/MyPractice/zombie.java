package MyPractice;
import java.util.Scanner;
public class zombie {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day=0;
        while(inhabitants>0){
            day++;

            System.out.println("Day " + (day-1) +" [" +inhabitants +"] ");
            inhabitants/=2;





        }

    }
}
