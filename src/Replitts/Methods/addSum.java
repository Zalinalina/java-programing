package Replitts.Methods;

import ReplitArrayList.sum;

import java.util.*;

public class addSum {

        //create your method below
        public static ArrayList<Integer> appendPosSum(ArrayList<Integer> nums) {
            ArrayList<Integer> num = new ArrayList<>();
            for (int each : nums) {
                if(each > 0){
                    num.add(each);
                }

            }
            int sum = 0;
            for(int each1 : num){
                sum+=each1;

            }

            num.add(sum);
            return num;

        }

        // Do not touch below

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int size = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i < size; i++) {
                list.add(in.nextInt());
            }

            System.out.println(appendPosSum(list));

        }

    }

