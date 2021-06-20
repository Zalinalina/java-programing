package day51_inheritance;

public class Contractor extends Employee{
    @Override //1)lets everuone know that you are overriding this method
    //2) ensures that this method is being overriding . if not , it shows Errr
    public double  calculateSalary(double hourlyRate){
        return 50* 40 * hourlyRate;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
