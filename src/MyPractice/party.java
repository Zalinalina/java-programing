package MyPractice;

import java.util.Scanner;

public class party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String totalGuests ="";
        int i= 1;
        int count = 1;
        do{
            System.out.println("Please enter guest name:");
            String guestName = input.next();
            System.out.println("Do you want to enter new guest name:");
            String moreGuests = input.next();
            totalGuests += guestName + ", ";

            i++;
            if(moreGuests.equals("no")){
             break;
            }
            if(moreGuests.equals("yes")){
               continue;
            }

        }while(i >= 0);
        totalGuests = totalGuests.substring(0, totalGuests.lastIndexOf(", "));
        System.out.println("Guest's list: " + totalGuests);
    }

}



