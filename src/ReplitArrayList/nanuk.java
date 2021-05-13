package ReplitArrayList;

import java.util.*;

public class nanuk {

        public static boolean nanuk(ArrayList<String> r,int way_stones,int boast) {
            int sumOfr = 0;
            int countNanuk = 0;


            for (String each : r) {
                if (each.equals("nanuk")) {
                    countNanuk++;
                } else {
                    sumOfr += Integer.parseInt(each);

                }
            }

            if(way_stones>=countNanuk && sumOfr >= boast) {
                return true;
            }else {
                return false;
            }
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














