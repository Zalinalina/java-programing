package day07_arithmetiv_operators_casting;

public class StringConcat {
    public static void main(String[] args) {

        System.out.println("java" + 5 +3);//java53
        System.out.println("java" +(5 +3));// java8
        System.out.println(5+3+"java");// 8java
        System.out.println(5+(3+"java"));//53java
        System.out.println("hello"+1+2+3);//hello123
        System.out.println("hello"+(1+2+3));//hello6


        String str1 = "hello";
        String str2 = "friends";
        System.out.println(str1+str2);
        System.out.println(str1+" "+str2);//hello friends
        System.out.println(str1+" "+str1);



        int num1 = 7;
        int num2 = 8;
        System.out.println(num1+num2);//15
        System.out.println(num1 +" " +num2);// 7 8 with space
        System.out.println(num1+""+num2);
        System.out.println("" +num1+num2);



        char char1 = 'a';
        char char2 = 'b';




        System.out.println(char1 + char2);//195
        System.out.println(char1 + "" +char2);//ab
        System.out.println(char1 + char2);
    }
}
