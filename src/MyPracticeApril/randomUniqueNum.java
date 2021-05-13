package MyPracticeApril;

import java.util.Random;

public class
randomUniqueNum {
    public static void main(String[] args) {
    String whole = "0123456789";
    String  unique ="" ;
        Random random = new Random();

        for(int i =0; i <6; i++ ){
        int index = random.nextInt(10);
            System.out.print(whole.charAt(index));
        if (!unique.contains(whole.charAt(i) +"")){
            unique+= "" + whole.charAt(i);

        }


           System.out.print(unique);


        }
    }
}
