package OfficeHours.Practice_03_15_2021;

public class OperatorAnalize2 {
    public static void main(String[] args) {
        int a = 200;
        int b = -a++ +- --a *a -- % 2 + a;
        System.out.println(a);
        System.out.println(b);
    }
}
