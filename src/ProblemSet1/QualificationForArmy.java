package ProblemSet1;

public class QualificationForArmy {
    public static void main(String[] args) {
        /*
        [Qualification For Army]
Given information: Citizenship(String), resident (boolean), and has high school diploma
(boolean), and age(int). Determine if the person is qualified to join the army.
- The person must be a Citizen of the USA or a resident
-> If not print: You must be a U.S. citizen or a resident
- Their age must be between 18 and 35
-> If not print: Your age must be between 18 to 35 years old
- They must have a high school diploma
-> If not print: You must have a high school diploma
> If all the criteria is met print: You are qualified for the US Army
         */

        String citizenship = "USA";
        boolean resident = true;


        if(citizenship.equalsIgnoreCase("USA") || resident) {
            int age = 18;
            if(age >= 18 && age <= 35) {
                boolean hasDiploma = true;
                if(hasDiploma) {
                    System.out.println("You are qualified for the US Army");
                }else {
                    System.out.println("You must have a high school diploma");
                }


            }else{
                System.out.println("Your age must be between 18 and 35");
            }


        }else{
            System.out.println("You must be a Citizen of the USA or a resident");
        }
    }

}
