import java.util.Scanner;

public class saimstask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                int A = scan.nextInt(), count=0;
                for (int i = 1; i <= A; i++) {
                    count=0;
                    for (int j = 1; j <= i; j++) {
                        if(i%j==0){
                            count++;
                        }
                    }
                    if (count==2){
                        System.out.println(i);
                    }
                }

            }
        }
