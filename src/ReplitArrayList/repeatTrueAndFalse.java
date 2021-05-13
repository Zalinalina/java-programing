package ReplitArrayList;

import java.util.*;
import java.util.ArrayList;
public class repeatTrueAndFalse {



        //create your method below
        public static ArrayList<Boolean> repeatAll (ArrayList<Boolean> trueAndFalse){

        ArrayList <Boolean> list = new ArrayList<>(trueAndFalse);
         for(boolean each : trueAndFalse){
            list.add(each);

        }


        return list;




    }

    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextBoolean());
        }

        System.out.println(repeatAll(list));

    }

}

