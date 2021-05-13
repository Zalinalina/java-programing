package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
// break statement
        for (int n = 1; n < 5; n++) {
            System.out.println(n );//just 1 because of break

            if (n == 3) {
                break;
            }
        }
        for (int i = 1; i <= 5; i++) {
            if(i == 2 || i== 4) {
                continue;//go to next iteration

            }
            System.out.print(i);
        }
    }
}
