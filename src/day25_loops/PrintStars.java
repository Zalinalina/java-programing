package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars=1; stars<=15; stars++){
            System.out.print(" * ");
        }

        String myStars = "";
        System.out.println();
        for(int stars=1; stars<=5; stars++){
           // myStars= myStars + "* ";
            myStars+="* ";
        }

        System.out.println("my stars = "+ myStars.trim());//remove last space

    }
}
