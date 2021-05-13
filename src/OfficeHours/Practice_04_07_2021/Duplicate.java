package OfficeHours.Practice_04_07_2021;

public class Duplicate {
    public static void main(String[] args) {
        /*
        Given a String, find and print the duplicate characters.
         A character is duplicate if it appears more than once in the String.
          Ex:AAABCCDEEFOutput:ACE
         */
        String str = "AAABCCDEEF";
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            if(checked.contains("" + str.charAt(i))){
                continue;

            }

            str.charAt(i);

            // str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {//A==A
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(str.charAt(i) + " is duplicate");
            }
            checked += str.charAt(i);
        }
    }
}