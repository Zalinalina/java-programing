package OfficeHours.Practice_03_29_2021;
/*
 String str = "ccbreadjamjellybread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)

        if(str.contains("bread")) {

            int firstBread = str.indexOf("bread");

            if(str.substring(firstBread+5).contains("bread")) { //jambread

                int secondBread = str.lastIndexOf("bread");
                System.out.println(str.substring(firstBread + 5,secondBread));
                //                                     0 + 5 -> 5,8

            } else {
                System.out.println("nothing");
            }

        } else {
            System.out.println("nothing");
        }
You do not have permission to send messages in this channel.

 */

public class Sandwich {
    public static void main(String[] args) {
        String str = "breadjam";//0+5=5->substring(5)->jam.cotain("bread");
        if (str.contains("bread")) {
            int firstBread = str.indexOf("bread");
            if (str.substring(firstBread + 5).contains("bread")) {//jambread
                int secondBread = str.lastIndexOf(("bread"));
                // int secondBread = (str.substring(firstBread+5).contains("bread");
            } else {
                System.out.println("nothing");
            }
        }
    }
}
