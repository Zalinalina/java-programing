package ProblemSet1;

public class OperatorsS2And3 {
    public static void main(String[] args) {
        int a = 3, b = 2;
        long c =( a-- + b)* 2 / 3 % 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int a1=15 , b1=2 , c1 = 9;
        long d = (++a1 - b1-- - --c1)*2;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d);
        System.out.println("===========================================");

        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        int biggest = numOne > numTwo ? numOne : numTwo;
        System.out.println(numOne);
        System.out.println(numTwo);
        System.out.println(biggest);




    }
}
