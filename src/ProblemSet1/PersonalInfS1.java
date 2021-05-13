package ProblemSet1;
import java.sql.SQLOutput;
import java.util.Scanner;
public class PersonalInfS1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people = scan.nextInt();
        if (people < 2 && people >= 0) {
            System.out.println("Live with less than 2 people:" + people);
        } else if (people < 6 && people >= 3) {
            System.out.println("Live with people " + people + " people");

        } else {
            System.out.println("Live with more than 6 people: " + people);
        }
        System.out.println("What city do you live in?");
        String city = scan.next();
        System.out.println("Do you live in downtown?");
        String downtown = scan.next();
        if (downtown.equals("Yes")) {
            System.out.println("Have you thought about moving to the suburbs?");
            String moving = scan.next();
            if (moving.equals("Yes")) {
                System.out.println("Do it. It's great!");
            } else if (moving.equals("No"))
                System.out.println("You should think about it.");
        }
            System.out.println("What is your favorite animals?");
        String animals = scan.next();
        System.out.println("Wow " + animals +" is a great animal!");
        System.out.println("How many pets do you want to have?");
        int pets = scan.nextInt();
        System.out.println("Interesting, do you want " + pets +" " + animals + "?");
        boolean answer = true;
        System.out.println("That is " +answer);



        }
    }








