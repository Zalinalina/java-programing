package day54_abstraction;

public class School {
    public static void main(String[] args) {
        // Student student = new Student() { cannot create object

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.attendClass();

        CamousStudent camousStudent = new CamousStudent();
        camousStudent.attendClass();

        }
    }

