package OfficeHours.Practice_03_31_2021;

public class countUpperLowerOrNumber {
    public static void main(String[] args) {
        String str = "78+5465222156554";
        int upperCase =0, lowerCase=0, number=0;
        for(int i = 0; i < str.length()-1; i++){
            char eachLetter = str.charAt(i);// 2 -> ascii:50

            if(eachLetter >= 'A' && eachLetter <= 'Z') {
                upperCase++;
            }else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lowerCase++;
            }else if (eachLetter >= '0' && eachLetter <= '9') {// ascii 48-57
                number++;
            }

        }
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
        System.out.println(("Number: " + number));
       // System.out.println(str.substring(str.charAt(3), str.charAt(7)));
    }
}
