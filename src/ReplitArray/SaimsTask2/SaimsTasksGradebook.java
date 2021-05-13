package ReplitArray.SaimsTask2;
//import java.util.*;
public class SaimsTasksGradebook {
    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
       String[] names = {"Mile", "Joe", "Ana", "Ali", "Joanna"};
        //String[] names =  {input.next()};
       int[] scores = {80,54,100,66,94};
        //int[] scores = {input.nextInt()};
       char[] grades = {'B','D','A','C','A'};
        //char[] grades = {input.next().charAt(0)};

for(int i = 0; i < names.length; i++) {
   // System.out.println(names[i]);

   System.out.println(names[i] + "|" + scores[i] + "|" + grades[i] );
}
    }
}
