package day04_variables_intro;

public class VariableNamingRules {
    public static void main(String[] args) {
        int public2 = 4;
        System.out.println(public2);
        int Public = 44;
        System.out.println(Public);
        int publicABC = 44;
        System.out.println(publicABC);


        int static2 = 22;
        int _static = 22;
        int $tatic = 44;
        int staticVar = 234;

        int salary$ = 55;
//        int 1stMonthsalary = 3000 - can't start with number
        int $ = 10;
        int _ = 3;
        System.out.println($);
        System.out.println(_);
//        above variables worked fine but not recommended
//        we should use meaningful veriable names
//        int number-of-friends = 400; (-)not allowed
        int numberOffFriends = 401;
      int number_of_friends = 401; // not convention



    }
}
