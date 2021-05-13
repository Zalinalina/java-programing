package MyPracticeApril.MethodsReplits.replitMethods;
import java.util.*;
public class splitEmail {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            String s = inp.next() ;
            person(s) ;
        }

        public static void person(String info) {
            //your code here
           // for( String each : s )

            String[] nameArr = info.split(",");
            //Arrays.toString(nameArr);
            System.out.println("person name: " + nameArr[0]);
            System.out.println("last name: " + nameArr[1]);
            System.out.println("age: " + nameArr[2]);




        }
}
