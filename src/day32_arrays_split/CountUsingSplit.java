package day32_arrays_split;
import java.util.*;
public class CountUsingSplit {
    public static void main(String[] args) {


        String cats = "bengal cat tabby cat persian cat no cat here some other cat type";
/*
    int count = 0;
        for (int i =0 ; i <=cats.length-1; i++) {
            if(cats.substring(i, i+3).equals("cat")){
                count ++;
            }
        }
        System.out.println("count of cats = " + count);

 */

        String[] catsArray = cats.split("cat");
        System.out.println("number of 'cat' = " +(catsArray.length-1));

        for(String type : catsArray){
            System.out.println(type);
        }
    }
}