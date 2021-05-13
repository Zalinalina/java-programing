package day24_loops;

public class decreaseByOne {
    public static void main(String[] args) {
        int count = 5;
        while (count >= 0){
            System.out.println("count = " +count);
            count--;
        }
        System.out.println("Finished the count");



        int unreadSMS = 10;
        /*
        Read each message one by one until you have 0 unread SMS
         */
        while (unreadSMS > 0) {//or >=1
            System.out.println("I have total " + unreadSMS);
            --unreadSMS;
        }
        System.out.println("No more unread messages");
    }
}