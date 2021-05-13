package day27_loop;

public class ReadStringPortion {
    public static void main(String[] args) {
//                     0123//cat
        String list = "cat,car,cat,red car,java,selenium";
        for(int i = 0; i < list.length()-2; i++) {
            System.out.println(list.substring(i, i + 3));
        }


        /*
int i = 0;
        System.out.println(list.substring(i,i+3));
        i++;
        System.out.println(list.substring(i,i+3));
        i++;
        System.out.println(list.substring(2,5));
        i++;
        System.out.println(list.substring(3,6));
        i++;
        System.out.println(list.substring(4,7));
        i++;
        System.out.println(list.substring(5,8));
        System.out.println(list.substring(8,11));

         */


    }
}
