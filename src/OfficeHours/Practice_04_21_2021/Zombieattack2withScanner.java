package OfficeHours.Practice_04_21_2021;
import java.util.*;
public class Zombieattack2withScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int days = 0;

        System.out.println("Day: " + days++ +" " + Arrays.toString(inhabitants));

        while (!Arrays.equals(inhabitants, new int[8])){

            int [] temp = Arrays.copyOf(inhabitants, inhabitants.length);
            for (int i =0; i < inhabitants.length; i++){
                if (inhabitants[i] == 0){
                    if (i == 0){

                        temp [i+1] = temp[i + 1] /2;

                    }else if (i == inhabitants.length-1) {

                        temp [i-1] = temp[i - 1] /2;

                    }else {
                        temp [i+1] = temp[i + 1] /2;
                        temp [i-1] = temp[i - 1] /2;
                    }
                }
            }
            inhabitants = Arrays.copyOf(temp, temp.length);
            System.out.println("Day: " + days++ + " " + Arrays.toString(inhabitants));

        }
        System.out.println("----EXTINCT----");
                    }

    }

