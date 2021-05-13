package OfficeHours.Practice_03_2_2021;
/* - String name
          - byte age
        - char gender
        - boolean student
        - short number of siblings
        - long favorite number
        - int number of seasons in your area
        - double birth date: (month.day)
        - int year
        - String full birthday date with year
        - String favorite quote

        - Print the person information
        - Challenge: print your name in a cool way (unicode)
    - Challenge: char star
        */
public class PersonInfo {
    public static void main(String[] args) {
        // Variables
        String name , fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        //Assignment of data
        name = "Zalina";
        age = 25;
        gender = 'f';
        student = true;
        numberOfSiblings = 0;
        favoriteNumber = 7;
        numberOfSeasons = 4;
        birthDate = 3.2;
        year = 2021;
       // fullBirthDate =  birthDate +year+"";// 2025.2 - adds first then turns to String
       fullBirthDate ="" + birthDate+"."+year;
        favoriteQuote = "have a good mindset";

       // System.out.println(birthDate + '.'); // '.'=46 +3.2
        System.out.println("Full birthdate:" +fullBirthDate);



        System.out.println(fullBirthDate);

    }
}
