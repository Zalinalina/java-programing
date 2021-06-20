package day52_inheritance.discordUsers;

public class Admin extends User{

    public Admin(String name, int id) {
        super("Admin", name, id);//call super class/ user class no-args constructor
        System.out.println("Admin class constructor");
    }

    @Override
    public String toString() {
        return "User{" +
                "role='" + getRole() + '\'' +
                ", name='" + getName() + '\'' +
                ", id=" + getId() +
                '}';
    }


}
