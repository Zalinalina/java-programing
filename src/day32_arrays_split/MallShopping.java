package day32_arrays_split;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
public class MallShopping {
    public static void main(String[] args) {
        //                   0         1         2          3        4             5
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {  99.99,    150.0,   9.99,     250.0 ,  439.50,    39.99};
        int[] itemIDs =   {  12345 ,   12346,   12347,   12348,    12349,     12350};


        System.out.println("--------------FIND THE INDEX OF 'Gloves' in items array------------------------");
        int indexOfGloves = -1;
        for(int i = 0; i < items.length; i++){
           // System.out.println(i + "-"+items[i]);
            if(items[i].equals("Gloves")){
                System.out.println("Gloves found at index " +i);
                 break;
            }

            }
        System.out.println("-------Set boolean to true if first 'iPad' is found-----------");
        boolean iPadExist = false;
        for(String item: items) {
            if (item.equalsIgnoreCase("iPad")) {
                iPadExist = true;
                break;
            }
        }
        System.out.println("iPadExist = " + iPadExist);
        if(iPadExist) {
            System.out.println("We bought the iPad");
        }else{
            System.out.println("We forgot the iPad! :(");
        }
        System.out.println("-------- print a report of each shopping item-------------");
        for(int i = 0; i < items.length; i++){// length of any item, prices or id
            System.out.println(items[i] + ": \t$" +prices[i] + " \t #" +itemIDs[i]);
        }

        System.out.println("----------Look for 'Jacket' in items and print all details-----------");
        for(int i = 0; i < items.length; i++){
            if(items[i].equalsIgnoreCase("Jacket")){
                System.out.println(items[i] + ": \t$" +prices[i] + " \t #" +itemIDs[i]);
                break;//stop searching after jacket is found
            }
        }
        }

    }

