package OfficeHours.Practice_15_06_2021;

public class Gmail extends Email {

    static String domain;

    static {
        domain = "Gmail";
    }

    public static void sendEmail() {
        System.out.println("Sending from Gmail");
    }

    public static void  sendSuperEmail() {
        Email.sendEmail();
    }
    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }


}
