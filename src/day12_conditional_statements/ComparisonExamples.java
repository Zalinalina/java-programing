package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        //currentSpeed, speedLimit, isSpeeding
       int currentSpeed = 4_5;//45
       int  speedLimit =  5_5;//55
      // boolean isSpeeding =  //true if speeding, false if not speeding
        System.out.println(currentSpeed > speedLimit);//45not>55
        System.out.println(speedLimit < currentSpeed);//55not<45
        System.out.println(speedLimit == currentSpeed);//55not=45

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you Speeding?- " + isSpeeding);

        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");


        //45+20=65
        currentSpeed += 20;//65
        isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you Speeding?- " + isSpeeding);

        System.out.println("currentSpeed = " + currentSpeed + " mph");
        System.out.println("speedLimit = " + speedLimit + " mph");


        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can i afford it? - "+( accountBalance >= itemPrice));//true


        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("can afford = "+ canAfford);

        //decrease balance by itemPrice. using shorthand operator
        //accountBalance = accountBalance -itemPrice;
        accountBalance -= itemPrice;//the same

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke?-" + isBroke);



    }
}
