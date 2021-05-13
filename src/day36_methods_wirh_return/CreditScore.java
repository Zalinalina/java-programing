package day36_methods_wirh_return;
import java.util.*;
public class CreditScore {
    public static void main(String[] args) {
        checkEligible(725);
        checkEligible(760);
        checkEligible(690);
        //   System.out.println(checkEligible(711));//ERROR we cant print void method
        System.out.println(getCreditScore());
        System.out.println("Creditcore = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("score = " + score);



    }


    public static int getCreditScore() {
        return 800;
    }


    public static void checkEligible(int creditScore) {

        if (creditScore >= 700) {
            System.out.println("you are eligible for leasing this car");
        } else {
            System.out.println("Sorry, you are eligible for leasing this car");
        }
    }
}


