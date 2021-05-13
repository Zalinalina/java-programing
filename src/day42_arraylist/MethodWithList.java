package day42_arraylist;

import ReplitArrayList.sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("selenium");
        words.add("a");
        words.add("input");
        words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        printStrList((Arrays.asList("select", "option", "br", "python", "sql", "API")));

        List<Integer> nums = Arrays.asList(23, 54, 23, 54454, 234, 11, 5, 2);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);
    }

    public static void printStrList(List<String> stringList) {//"java", "apple", "coffee", "tea"
        for (String str : stringList) {

            //print that number

            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static int sumIntegerList(List<Integer> list) {
        int sum = 0;
        for (int each : list) {
            sum += each;
        }
       // System.out.println(sum);

    return sum;

}


    }
