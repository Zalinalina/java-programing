package day15_logicalops_awitch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true ||true));
        System.out.println("true || false = " + (true ||false));
        System.out.println("false || true = " + (false ||true));
        System.out.println("false || false = " + (false ||false));
        int apples = 5;
        int oranges = 7;
        System.out.println(apples > 3 || oranges > 4);

        if(apples>3 ||oranges>4) {
            System.out.println("no need to buy any fruits today");
        }else{
            System.out.println("Need to get some fruits");
        }

        System.out.println(apples>2 ||oranges>10);
        System.out.println(apples>2 && oranges>10);

        if(apples>2 ||oranges>10){
            System.out.println("looks like we sre good with fruits");

        }else{
            System.out.println("Need to get some fruits");
        }
        System.out.println(apples==0 ||oranges==0);
        if (apples==0 ||oranges==0){
            System.out.println("We need to purchase some fruits");

        }else{
            System.out.println("We are good with fruits");
        }
    }
}
