package ReplitArrayList;

import java.util.*;
import java.util.ArrayList;

public class sum1 {




        //create your method below

        public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums) {
            ArrayList<Integer> In = new ArrayList<>();
            for(int each : nums){
              In.add(each * 2);
           // for (int i = 0; i < nums.size(); i++) {
            // In(i]*=2;
            }
return In;

        }

        // Do not touch below

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.nextInt());
            }

            System.out.println(timesTwo(list));

        }

    }

