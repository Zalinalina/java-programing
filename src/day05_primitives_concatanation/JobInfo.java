package day05_primitives_concatanation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET";
        String company = "Palo Alto Networks";
        String jobDescription = "Java, Seleniun, Cucumber, Tomato, JUnit ";
        double salary = 123000;
        byte yearsOfExp = 3;
        boolean hasBenefits = true;


        System.out.println("Job title is:\t\t\t\t " + title);
        System.out.println("Company:\t\t\t\t\t " + company);
        System.out.println("Job description:\t\t\t " + jobDescription);
        System.out.println("Salary:\t\t\t\t\t\t $" + salary);
        System.out.println("Years of experience:\t\t " + yearsOfExp);
        System.out.println("Has benefits?\t\t\t\t " + hasBenefits);


    }
}
