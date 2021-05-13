package day07_arithmetiv_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println(10+5);
        System.out.println(10+5-3);//12
        System.out.println(10-5+3);//8
        System.out.println(10-(5+3));//2



        System.out.println(2*3);
        System.out.println(2 *3 / 3);//2
        System.out.println(20 / (2*2));//5

       // System.out.println(10/0);cannot devide by 0 error while code is running

        System.out.println(2 + 5 * 3);//17
        System.out.println((2+5) * 3);//21
        System.out.println();
        System.out.println(0/10);//0


        System.out.println(10/3); //3
        System.out.println(5/2);//2

        double n1 = 10;
        double n2 = 3;

        float num1 =5;
        float num2 = 2;

        System.out.println(n1/n2);
        System.out.println(num1/num2);

    }
}
