package OfficeHours.Practice_03_16_2021;

public class ExamplesOnIf {
    public static void main(String[] args) {
        int a = 10;
        int b = a-- *2 - --a %  2 + a;
        System.out.println(b);
        System.out.println(a);


        if (11 % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");

        }
        //2 % 7 = 2 if it is bigger number than it is always first number
        System.out.println( -2 % 7);
    }
}
