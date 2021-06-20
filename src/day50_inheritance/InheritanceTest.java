package day50_inheritance;

import java.util.ArrayList;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Bakyt";
        p1.age =  30;


        p1.talk();
        p1.walk();
        p1.work("SDET");


        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Saim";
        t1.age = 25;
        t1.talk();
        t1.walk();
        t1.teach("java inheritance");

        Student s1 = new Student();
        s1.name = "Ali";
        s1.age = 33;
        s1.walk();
        s1.talk();
        s1.work("Java programmer");
        s1.school = "CybertekSchool";
        s1.study("Java programming inheritance");
    }
}
