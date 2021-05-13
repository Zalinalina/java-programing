package MyPractice;

import java.util.Scanner;

public class javaPhitom {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < sentence.length() - 5; i++) {


                    if(sentence.substring(i, i+4).equals("java")){
                        count1++;
                    }
                    if(sentence.substring(i, i+6).equals("python")){
                        count2++;
                    }


                }
                System.out.println(count1==count2);
            }

        }










