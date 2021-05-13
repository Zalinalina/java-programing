package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs = {12345, 12346, 12347, 12348, 12349, 12350};
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        /*
        double maxPrice = 0;
        double minPrice = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("iPad")) {
                if (prices[i] > maxPrice) {
                    maxPrice = prices[i];
                    System.out.println(items[i] + " " + maxPrice);

                    if (items[i].equalsIgnoreCase("Gloves")) {
                        if (prices[i] < minPrice) {
                            minPrice = prices[i];
                            System.out.println(items[i] + " " + minPrice);
                            break;


                        }
                    }
                }

            }

         */
        System.out.println(" -----2) find and print details of most expensive item");
        double maxPrice2 = prices[0];//assume first price is max
        int indexOfMaxPrice = 0;///assume first price  max is at index of
        for (int n = 0; n < items.length; n++) {
            if (prices[n] > maxPrice2) {
                maxPrice2 = prices[n];
                indexOfMaxPrice = n;


            }


        }
        System.out.println("maxPrice2 = " + maxPrice2);
        System.out.println("indexOfMaxPrice = " + indexOfMaxPrice);
        System.out.println(items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - #"
                + itemIDs[indexOfMaxPrice]);


        System.out.println(" -----1) find and print details of most cheap item");
        double minPrice = prices[0];//assume first price is max
        int indexOfMixPrice = 0;///assume first price  max is at index of
        for (int i = 0; i < items.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                indexOfMixPrice = i;
            }

            }
        System.out.println("minPrice = " + minPrice);
        System.out.println("indexOfMixPrice = " + indexOfMixPrice);
        System.out.println(items[indexOfMixPrice] + " - $"+ prices[indexOfMixPrice] + " -   #"+ itemIDs[indexOfMixPrice]);
        }
    }