package day52_inheritance.discordUsers;

import day52_inheritance.discordUsers.Admin;
import day52_inheritance.discordUsers.User;

public class B22DiscordServer {

    public static void main(String[] args) {
        User user1 = new User("Z", "A", 12);
        user1.setId(1234);
        user1.setName("Zalina");
        user1.setRole("Student");


        Admin admin1 = new Admin("a", 123);
        admin1.setId(43145);
        admin1.setName("Sergio");
        admin1.setRole("Teacher");

        System.out.println(user1);
        System.out.println(admin1);

        Admin admin2 = new Admin("Gulia", 4138);
        System.out.println(admin2.toString());
    }
}
