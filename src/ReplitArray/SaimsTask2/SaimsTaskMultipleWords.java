package ReplitArray.SaimsTask2;
import java.util.*;
public class SaimsTaskMultipleWords {
    public static void main(String[] args) {
        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer ";


        String[] word = words.split(", ");
         for (String each : word){
             if(each.contains(" ")) {
                 System.out.println(each);
             }
         }
    }
}
