package day18_condotions_practice_string_intro;

public class SwitchCheckNumbers {
    public static void main(String[] args) {

        int num1 = 20;
       int num2 = 18;

switch(num1) {
    case 10://if
        num1++;
        num2 += 10;
        break;
    case 20://if else
        num1 += ++num2;//39
        num2--;//19
       // break;//withot break go down
    case 30://if else
        num1 += 5;//44
        num2 -= 3;//15
        break;
}
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
