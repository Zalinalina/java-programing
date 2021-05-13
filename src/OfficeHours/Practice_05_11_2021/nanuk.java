package OfficeHours.Practice_05_11_2021;

import java.util.ArrayList;
import java.util.Scanner;

public class nanuk {

    public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) {
        int foodFound = 0;
        //int countNanuk = 0;


        for (String each : r) {
            if (each.equals("nanuk")) {
                way_stones--;
            } else {
                foodFound += Integer.parseInt(each);

            }
        }

        return way_stones>= 0 && foodFound >= boast;

        }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(nanuk(list, stones, boast));

    }

}



