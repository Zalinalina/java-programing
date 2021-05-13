package OfficeHours.Practice_04_13_2021;

import java.util.*;

public class MultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer ";
        String[] wordArr = words.split(", ");
        for (String each : wordArr){
            if(each.contains(" ")){
                System.out.println(each);
            }
        }
    }
}
