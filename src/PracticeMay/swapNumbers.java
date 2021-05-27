package PracticeMay;

public class swapNumbers {
    public static void main(String[] args) {
        int x = 7;
        int y = 5;

        int temp = 0;
        temp = x;
        x = y;
        y = temp;

        System.out.println(x);
        System.out.println(y);


        int a = 3;
        int b = 4;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a);
        System.out.println(b);

    }
}
