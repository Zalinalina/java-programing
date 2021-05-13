package ReplitArray;
import java.util.*;
public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        System.out.println(Arrays.toString(score));
        Arrays.sort(score);
        System.out.println(Arrays.toString(score));
        double sumScore = 0;
        for (int i =1; i <score.length-1; i++) {
            sumScore += score[i];
        }
        System.out.println("sum is : " + sumScore);
           // System.out.println("Enter score for judge "+ (i+1)+":");
        System.out.println("Enter difficulty: ");
            double difficulty = input.nextDouble();

            double total = 0;

            total = sumScore * difficulty * 0.6;

      //  System.out.println("Total score: " +totalScore);
        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);
    }
}


