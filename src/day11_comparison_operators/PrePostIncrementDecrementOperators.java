package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 =1;
        num1++;
        ++num1;
        System.out.println(num1);
        
        int numb1 =4;
        int numb2 = ++numb1;
        
        
        //pre increment ++ means increase by 1
        int number1 =10;
        //++number1; add 1
        //int number2 = number1;
        int number2 = ++number1;
        System.out.println("number1 = " + number1);//11
        System.out.println("number2 = " + number2);//11


        // post incresment add 1 after vwards
        int number3 =8;
       // int number4 = number3;
      //  number3++; add1
        int number4 = number3++;
        System.out.println("number3 = " + number3);//9
        System.out.println("number4 = " + number4);//8


        int apples = 5;
        int basket = ++apples;
        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;//5
        System.out.println(++cars);//6

        int sedans = 10;//10
        System.out.println(sedans++);//10 because ++after
        System.out.println(sedans);//11 increase afterwards


        int a = 50;
        int b = 22;
                //50 + 23
        int c = a++  +  ++b;
        //adds 1 to a here, at this step afterwards  a++
        System.out.println("a =" + a);//51
        System.out.println("b ="+ b);//23
        System.out.println("c ="+c);//73



    }
}
