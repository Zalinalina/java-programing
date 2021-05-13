package day18_condotions_practice_string_intro;

public class FizzBazz {
    public static void main(String[] args) {
        int num =15;
        if (num % 3 ==0 && num % 5 ==0){// if just iff will check and print everything
            System.out.println("FizzBuzz");
        }
        else if (num % 3 == 0) {// if you put this condition on the top, it will print only this and skips rest
        System.out.println("Fizz");
    }else if (num % 5 == 0){
        System.out.println("Buzz");
        }else{
            System.out.println(num);
        }

    }
}
