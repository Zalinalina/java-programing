package OfficeHours.Practice_06_15_2021;

public class EmailObject {

    public static void main(String[] args) {

        Email email = new Email("Zalina@ctbertek.com", 35);
        System.out.println(email);
        System.out.println(Gmail.domain);
       // email.ADDRESS = "email" ;//address is final , cannot change
        System.out.println(Email.domain);

        Gmail gmail = new Gmail("Kamran@gmail.com", 133);
        System.out.println(gmail);
        System.out.println(Gmail.domain);

        System.out.println(Email.domain);
        System.out.println();


        Yahoo yahoo = new Yahoo("jamesbond@yahoo.com", 155);

        System.out.println(Email.domain);
        System.out.println(Gmail.domain);
        System.out.println(Yahoo.domain);

        Email email1 = new Email("random@email", 4);
        System.out.println(Email.domain);
        System.out.println(Gmail.domain);


        Gmail.sendEmail();
        Gmail.sendEmail();
    }
}
