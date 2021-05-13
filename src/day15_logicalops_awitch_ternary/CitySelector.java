package day15_logicalops_awitch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city1 = "La";
        String city2 = "San Diego";
        if (city1.equals("LA") || city2.equals("San Diego")) {
            System.out.println("Willing to relocate to either one");
        } else {
            System.out.println("Not considering California");

        }
        String city = "Boston";
        //Moscow or Tampa
        if (city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {

            System.out.println("Not considering - " + city);
            //String city3 = "Boston";
            //Moscow or Tampa
            //if (city3.equals("Moscow") && city3.equals("Tampa")) { this condition never true
            //   System.out.println("Willing to relocate to " + city3);
            //} else {
            //   System.out.println("Not considering - " + city3);
        }
        String teacher = "Nodir";
        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("it is a java class with " + teacher);
        } else
            if(teacher.equals("Nodir")) {


        }
        teacher = "Akbar";
        if (teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("it is a java class with " + teacher);
        } else if (teacher.equals("Nodir")) {
            System.out.println("skill class with " + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }
        // company - "Google or salary >= 100k -> accept offer
        String company = "Amazon";
        double salary  = 105_000.0;
        if (company.equals("Google") ||  salary >= 100_000.0) {
            System.out.println("Accepting offer from " + company);
        }else{
            System.out.println("Rejecting offer from "+ company);
        }


    }
}