package day41_Arraylist;

import java.util.ArrayList;

public class CitiesList {

    public static void main(String[] args) {
        //declare arrayList. alt + enter

        ArrayList<String> cities = new ArrayList<>();
        //add cities to ArrayList
        cities.add("Washington DC");//0
        cities.add("New York");//1
        cities.add("Vienna");//2
        cities.add("Adana");//3
        cities.add("LA");//4

        // add Ashgabat to first index
        cities.add(0,"Ashgabat");
//print all values in the same line
        System.out.println(cities);
        //print first and last city
        System.out.println("First city = " + cities.get(0));
       // System.out.println("Last city = " + cities.get(5));
        System.out.println("Last city = " + cities.get(cities.size()-1));
        //print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("there are " +size + " cities in the list");

        //for loop and print all values in same line
        for (int i =0; i < cities.size(); i++){
           // System.out.print(cities);
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();

        for (String each : cities){
            System.out.print(each + " ");
        }
        System.out.println();
        //delete item from arraylist

        //1) remove using index. delete value at index 3
        cities.remove(3);

        //2) remove using object
        cities.remove("New York");// if we have 2 new yorks it will remove only first one

        System.out.println("after remove = " + cities);


        //delete/remove all values from list
        cities.clear();

        //make sure it ia clear
        //1) print it out
        System.out.println("cities = " + cities);

        //2) using isEmpty
        if (cities.isEmpty()) {
            System.out.println("list is empty");


        }

        //3) check size() ==0;
        if (cities.size()==0){
            System.out.println("list ia empty");
        }


    }


}
