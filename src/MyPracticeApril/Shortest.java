package MyPracticeApril;
import  java.util.Scanner;
public class Shortest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /*
        int count = 0;
        for (double  each : prices) {
            if (each > 50){
                count++;
                  for (String country : countries) {

            if (country.length()>= 7) {
                System.out.print(country + "-"+ country.length()+" ");
            }

        */





                // Do not touch above
       // int max = nums[0];
        //int max = 0;
       // for (int each = 1; each < nums.length; each++) {
          //  if (max < nums[each]) {
              //  max = nums[each];


//for( int i = 0; i < str.length; i++){
        String[] str = {scan.next(), scan.next(), scan.next(), scan.next(), scan.next(), scan.next()};
        String smalest = str[0];
                for(int i = 1; i < str.length; i++){
              //for(String word : str){
                    if (smalest.length() > str[i].length()){
                        smalest = str[i];
                    }
                }
        System.out.println(smalest);
        // Do not touch above
       // int short =str[0];

//String short = "";
       //    }

}

        }


