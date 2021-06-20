package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME = "change"; // cannot change the value of final variable
        final int SSN = 432123433;
        //SSN = 12334545;//error: variable is final
    }

    /**
     * error : cannot inherit from final class
     */
   // class Child extends TestData {

    //}
}
