package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();//from another class
        emp1.name = "Onurcan Dorgu";
        emp1.jobTittle = "SDET";
        emp1.work();

        Employee emp2 = new Employee();
        emp2.name = "Rahib Heydarov";
        emp2.jobTittle = "Full stack developer";
        emp2.work();

       emp1.work();



    }
}
