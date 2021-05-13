package OfficeHours.Practice_04_14_2021;

public class arraysQuiz {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;


        a=b;

        int[] n = {3,1,3};
        int[] n2 = {3,1};
        n = n2;
        n = new int[5];//00000
        System.out.println(n);
    }
}
