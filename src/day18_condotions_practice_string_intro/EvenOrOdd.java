package day18_condotions_practice_string_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num%2);
        System.out.println(num % 2 == 0);
        if (num % 2 ==0){//divisable
            System.out.println(num +" is even");
        }else{
            System.out.println(num + " is odd");
        }
    }
}
