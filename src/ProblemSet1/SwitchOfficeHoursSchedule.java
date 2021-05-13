package ProblemSet1;
import java.util.Scanner;
public class SwitchOfficeHoursSchedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        String day =scan.nextLine();
        switch(day){
            case "Monday": case "Tuesday": case "Wednesday":
                System.out.println("Office hours 5:30 - 6:45 EST");
                //break;
            case "Thursday":
                System.out.println("Soft Skills day");
               // break;
            case "Friday":
                System.out.println("Day off");
                //break;
            case "Saturday": case "Sunday":
                System.out.println("Already long day, no office hours");
                //break;
            default:
                System.out.println("Invalid day given");
        }



    }
}
