package day45_oop;

public class CompairingStrings {
    public static void main(String[] args) {
        String word1 = "java";//in string pool
        String word2 = "java";//re-use from string pool
        String word3 = new String("java"); // create new object create in heap outside string pool
        String word4 = new String("java"); // create new object create in heap outside string po


        System.out.println(word1 == word2);// true - point to sama object in pool
        System.out.println(word1 == word3);// false - point to different object in heap and pool
        System.out.println(word3 == word4);// false - point to different objects in heap

        System.out.println(word1.equals(word2));//true - comparing values
        System.out.println(word1.equals(word3));//true  - comparing values  data is the same fot all of them
        System.out.println(word3.equals(word4));//true - comparing values


    }


}
