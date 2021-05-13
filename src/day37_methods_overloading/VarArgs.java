package day37_methods_overloading;

public class VarArgs {//varargs

    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100, 200, 300);
        addNumbers(23,44,55,4,78,96,2,5,8,44,78,66,55,23,56,4,8,7);
        addNumbers();

        //int... myNumber = 10,4; //error var-args can only be used as method parameter

    }

    public static void addNumbers(int... nums){
        //inside the method it is used as regular array
        int sum = 0;
        for (int n : nums){
            sum += n;

        }
        System.out.println("sum = " +sum);

    }
}
