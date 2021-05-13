package ReplitArray;
import  java.util.*;
public class smalestWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        // write your code below

        String[] str1 = str.split(", ");
        String shortest = str1[0];
        for(String each : str1){

            if (each.length() < shortest.length()){
                shortest = each;
            }
            }
        String allShortestWords ="";
        for(String each : str1) {
            if (each.length() == shortest.length()) {
                allShortestWords += each + ",";

            }
        }
               allShortestWords = allShortestWords.substring(0,allShortestWords.length()-1);
                String[] shortestArray = allShortestWords.split(",");
                Arrays.sort(shortestArray);
                System.out.print(Arrays.toString(shortestArray));
            }
        }



