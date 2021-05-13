package day27_loop;

public class R2 {
    public static void main(String[] args) {
        String part = "cat,car,black cat,red car";
        for(int i = 0; i < part.length()-2; i++) {
            System.out.println(part.substring(i, i + 3));



            if (part.substring(i, i+3).equals("cat") || part.substring(i, i+3).equals("car")){
                System.out.println("part = " + part);
            System.out.println("cat or car found");

        }

    }
}
}