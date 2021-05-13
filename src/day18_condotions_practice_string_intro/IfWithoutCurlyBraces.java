package day18_condotions_practice_string_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String todayClass = "python";
        if (todayClass.equals("java"))
            System.out.println("java is fun");
        //System.out.println("java is fun again");
        else
            System.out.println("it is not java. it is "+ todayClass);


        int score = 1;
        if(score == 1)
            System.out.println("lowest score 1");
        else if (score == 2){
            System.out.println("score is ");
        }


        int a = 3;
        if(a==1){
            System.out.println("a is 1");
            System.out.println("1 is a");
        }
    }
}
