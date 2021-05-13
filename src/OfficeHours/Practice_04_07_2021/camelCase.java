package OfficeHours.Practice_04_07_2021;

public class camelCase {
    public static void main(String[] args) {
        String str = "thisHasManyWordsToFind";
        int word1 =1;
        String temp = "";

        if(str.isEmpty()){
            word1 = 0;
        }
        for (int i = 0; i<str.length();i++){
            temp += str.charAt(i);
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                word1++;
                System.out.println(temp.substring(0, temp.length() - 1));
                temp = "";
            }else{
                temp += str.charAt(i);


            }

        }

        int words = 1;//srart with one because first word start with lower case so we counted it

        for (int i = 0; i<str.length();i++){
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                words++;
            }
        }
        System.out.println("Words: " +words);
    }
}
