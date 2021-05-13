package day14_multy_branch_if_statements;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter 2 numbers: ");
      double  num1 = scan.nextDouble();
        double  num2 = scan.nextDouble();
        System.out.println("Enter operator: -,+,*,/" );
        char operator = scan.next().charAt(0);

        if (operator == '+'){
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Wrong operator-" + operator);
        }







        System.out.println("Enter 2 numbers: ");
        double  num3 = scan.nextDouble();
        double  num4 = scan.nextDouble();
        System.out.println("Enter operator: -,+,*,/" );
        char operator1 = scan.next().charAt(0);
        Double result;

        if (operator1 == '!'){
            result = (num3 + num4);
            System.out.println(""+"+"+num3 +"+"+ num4 +"=" +result);
        } else if (operator == '-') {
            result = (num3 - num4);
            System.out.println(""+"+"+num3 +"-"+ num4 +"=" +result);
        } else if (operator == '*') {
            result = (num3 * num4);
            System.out.println(""+"+"+num3 +"*"+ num4 +"=" +result);
        } else if (operator == '/') {
            result = (num3 / num4);
            System.out.println(""+"+"+num3 +"/"+ num4 +"=" +result);
        } else {
            System.out.println("Wrong operator-" + operator);
        }
    }
}
