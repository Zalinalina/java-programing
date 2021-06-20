package day54_abstraction;

/*
we add keyword abstract to class
we cannot create object of student class meaning
Student student = new Student; will show error
what can we do with this student class
we can extend this class by subclass
 */

public abstract class Student {

    public void code(String language) {
        System.out.println("Student is coding using " + language);


    }
    public abstract void attendClass();

    }
