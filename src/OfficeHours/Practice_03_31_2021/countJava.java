package OfficeHours.Practice_03_31_2021;

public class countJava {
    public static void main(String[] args) {
        String str = " java is fun. java class today, java";
        int count = 0;


        while(str.contains("java")) {
            count++;
            str = str.replaceFirst("java", "");

        }
        System.out.println("java was found " + count +" times ");
    }
}
