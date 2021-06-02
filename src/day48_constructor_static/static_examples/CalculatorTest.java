package day48_constructor_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator.add(5,3);//add is static method , can be called using claasname.staticMethodName
        //static  way of calling method
       // Calculator.multyply(2,4)//Error becaose of multyply is not static
        Calculator calcObject = new Calculator();
        //moltiply is instance method
        calcObject.multiply(2,4);

        calcObject.add(10,45);

    }
}
