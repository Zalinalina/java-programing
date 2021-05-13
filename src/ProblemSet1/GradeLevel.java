package ProblemSet1;
import java.util.Scanner;
public class GradeLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your grade level");
        byte gradeLevel = scan.nextByte();
        switch(gradeLevel){
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Elementary school");
                break;
            case 6: case 7: case 8:
                System.out.println("Middle school");
                break;
            case 9: case 10: case 11: case 12:
                System.out.println("High school");
                break;
            case 13: case 14: case 15: case 16:
                System.out.println("College");
                break;
            case 17: case 18:
                System.out.println("Grad school");
                break;
            default:
                System.out.println("Invalid grade level given");

        }
    }
}
