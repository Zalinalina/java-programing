package day17_ternary_nested_condition;

public class MoreTernary {
    public static void main(String[] args) {


       int hourlyRate = 50;
       String reply= (hourlyRate > 45) ? "accept" : "reject";
        System.out.println("reply = " + reply);


        String todaysClass = "java";
        String teacher = (todaysClass.equals("java") ) ? "Saim/Murado" : "Nodir";
        System.out.println("Today's teacher = " + teacher);



        boolean isEligibleToDrive = false;
        String driving = isEligibleToDrive ? "Have DL, Can Drive" : "No DL cannot drive";
        System.out.println("driving = " + driving);





    }
}
