package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        //0+1+2+3+4+5
        for (int num = 1; num <= 1000; num++) {

          System.out.println(num);
            sum += num;//sum = sum + i;
        }
        System.out.println("sum = " + sum);

    }
}