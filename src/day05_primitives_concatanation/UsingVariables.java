package day05_primitives_concatanation;

public class UsingVariables {
    public static void main(String[] args){
        int a = 1;
        int b = a;
        System.out.println(b);

        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);// 100
        System.out.println(num2);// 100

        num1 = 200;
        System.out.println(num1);//200
        System.out.println(num2);//100


        int n1 = 55;
        int n2 = n1;
        int n3 = n2;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        /* n1 =55
        n2=55
        n3=55
         */


        int inthirasZipcode = 22182;
        int parvinZipcode = inthirasZipcode;
        System.out.println(inthirasZipcode);//22182
        System.out.println(parvinZipcode);//22182

        inthirasZipcode = 20007;
        parvinZipcode = 33131;
        System.out.println(inthirasZipcode);//20007
        System.out.println(parvinZipcode);//22182


        int a1= 10;
        int a2 = a1;
        int a3 = a2;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        a2=20;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);






    }
}
