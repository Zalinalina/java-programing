package ReplitArrayList;

import java.util.*;
import java.util.ArrayList;

public class containsFinf {

    public static String search(ArrayList<String> r, String find) {
        // complete the method
        ArrayList<String> list = new ArrayList<>();
        for (String each : r) {
            if (each.contains(find)) {
                return each;
            }
        }
            return "search failed";
        }


            public static void main (String[]args){
                Scanner in = new Scanner(System.in);
                int size = in.nextInt();
                String find = in.next();
                in.nextLine();
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    list.add(in.nextLine());
                }
                System.out.println(search(list, find));
            }

        }


