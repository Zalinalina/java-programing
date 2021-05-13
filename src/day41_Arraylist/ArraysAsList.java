package day41_Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List <Integer> nums = Arrays.asList(23,1,34,54,654);
        System.out.println("nums = " + nums);
        //nums.add(100); add does not work//UnsupportedOperation
        ///nums.remove(0); remove does not work

        List<Integer> numList = new ArrayList(Arrays.asList(4,2,4,23,5344,100));
        numList.add(33);
        numList.add(56);
        System.out.println("numsList = " + numList);

        numList.remove(0);//0 is the index
        numList.remove(new Integer(23));
        System.out.println("numsList = " + numList);

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList
                ("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha", "celsius"));

        int caffeineAmount = 0;
       // String drink = "monster";
        for(String drink : drinksWithCaffeine){
        if (drink.equals("monster" ) || drink.equals("red bull") || drink.equals("celsius" )){
            caffeineAmount =150;
            System.out.println(drink + "-->" + caffeineAmount);

        }else if (drink.equals("coffee") || (drink.equals("kambucha"))) {
            caffeineAmount = 112;
            System.out.println(drink + "-->" + caffeineAmount);


        }else if(drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi")
                || drink.equals("mdew")){
                caffeineAmount = 35;
            System.out.println(drink + "-->" + caffeineAmount);

            }
    }
        //System.out.println(caffeineAmount);

        for(String drink : drinksWithCaffeine) {

            switch (drink) {
                case "monster":
                case "red bull":
                case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + "-->" + caffeineAmount);
                    break;
                case "coffee":
                case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + "-->" + caffeineAmount);
                    break;
                case "tea":
                case "coke":
                case "pepsi":
                case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink + "-->" + caffeineAmount);
                    break;
            }
        }

        drinksWithCaffeine.forEach(drink -> System.out.println(drink.toUpperCase()));

        drinksWithCaffeine.forEach(each -> {
            System.out.println("----------");
            System.out.println("each = " + each);
            System.out.println("----------");
        });

       // List <Integer> nums =Arrays.asList(2,4,5);
        nums.forEach(n -> System.out.println(n*n));
}
}