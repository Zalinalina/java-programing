package day13_conditional_statement;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean IsHungry = false;
        //if(IsHungry == true) {
        if (IsHungry){//shorter way
            System.out.println("I am hungry I will go get something to eat");
            System.out.println("Then code java");
        }else{
            System.out.println("I am not hungry. Let's keep coding java.");
        }


        double price =230.44;
        boolean isAffordable = price <= 200.0; // 200 is budget
        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable == true) {
            System.out.println("I can afford it, lets buy!");
        }else{
            System.out.println("Too expensive, lets keep coding java");
        }
        boolean isRemoteJob = true;
        //if it is NOT remoteJob print "Sorry I am not interested"
        //otherwise, printu "Sure I am interested, what is the interview process?"
        if(!isRemoteJob  ) {
            //if(!isRemoteJob == false ) {
            //if(isRemoteJob != true ) {
            System.out.println("Sorry, I am not interested");
        }else{
            System.out.println("Sure, I am interested, what is the interview process?");
        }



    }
}
