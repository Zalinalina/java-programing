package MyPracticeApril.MethodsReplits.replitMethods;
import java.util.Scanner;
public class positiveNegative {


        public static void sign(int n){
            //your code here
            if (n > 0){
                System.out.println("positive");
            }else if (n == 0) {
                System.out.println("zero");
            }else {
                System.out.println("negative");

            }

        }

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int n = inp.nextInt();

            sign(n);

        }
    }

