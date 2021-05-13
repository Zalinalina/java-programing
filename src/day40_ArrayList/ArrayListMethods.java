package day40_ArrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to mall");
        }
        shoppingList.add("shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");


        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        }else{
            System.out.println("List is not empty, code java then go to mall");
        }

        int count = shoppingList.size();
        System.out.println("Items to buy = " + count);


        System.out.println("Is shoes in my list? - " + shoppingList.contains("shoes"));//case sensetive Shoes will be false
        if (shoppingList.contains("shoes")) {
            System.out.println("Shoes are in the shopping list");
        }else{
            System.out.println("Shoes are not in the list");
        }

        System.out.println("Buying shoes ... $80");
        shoppingList.remove("shoes");
        System.out.println("List = " + shoppingList);

        System.out.println("Done with shopping, get back to coding");
        shoppingList.clear();//clear the list, remove all items
        System.out.println(shoppingList);
    }
}
