package PracticeMay;

import java.util.Arrays;

public class NumperPalindrome {
    public static void main(String[] args) {
        int num  =1235321;
        Integer numInt = num;// primitive -->objesct
        String strNum = numInt.toString();
        char [] charNum = strNum.toCharArray();

        System.out.println(Arrays.toString(charNum));

        int count = 0;
        for (int i = 0,j=charNum.length-1; i < charNum.length/2; i++,j--) {
            if (charNum[i]!=charNum[j]){
                count++;
                break;
            }

        }
        boolean isPalindrome = count == 0 ? true: false;
        System.out.println(isPalindrome);

    }
}

