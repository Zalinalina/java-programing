package day18_condotions_practice_string_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
       int score = 100;
       if (score >= 1 && score <= 40) {
           System.out.println("Grade D");

       } else if (score >= 41 && score <= 60){
           System.out.println("C");

    } else if (score >= 61 && score <= 90) {
           System.out.println("B");
       }  else if (score >= 91 && score <= 100) {
           System.out.println("A");
       }

       //else if (score <= 0 || score > 100){
           //System.out.println("Invalid code" + score);

       }

    }

