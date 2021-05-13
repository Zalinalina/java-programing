package day17_ternary_nested_condition;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 75;
        String result = (score >60) ? "pass" : "fail";
        System.out.println(result);

        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("");


        char grade = (score > 90) ? 'A' : 'B';
        System.out.println(grade);


        String evenOdd = (score % 8 == 0) ? "even" : "odd";
        System.out.println(evenOdd);



        
        int score1 =75;
        String result1;
        if (score1 > 60) {
            result1 = "Pass";
        }else{
            result1 ="Fail";
            System.out.println("result1 = " + result1);
        }
        
        // with ternary
        int score2 = 88;
        String result2 = (score > 60) ? "Pass" : "Fail";
        System.out.println("result = " + result2);


        String quality1 = "bad";
        System.out.println(quality1.equals("good") ? 100 : 0);
       int rating = quality1.equals("good") ? 100 : 0;

        System.out.println("rating = " + rating);
        
        int score3 = 100;
        char grade1 = (score3 > 90) ? 'A' : 'B';
      //  if(score > 90){
       //     grade1 = 'A';
       // }else{
        //    grade1= 'B';
      //  }
        System.out.println("grade1 = " + grade1);

        }

    }

