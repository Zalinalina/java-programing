package day19_class_vs_object_string;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "ABC123";

        String username = "CYBERTEK";
        String password = "aBC123";

        if(expUserName.equalsIgnoreCase(username) && expPassword.equals(password)) {
            System.out.println("Pass - user successfully logged in");
        }else{
            System.out.println("Fail - password is incorrect");


            //if(!expUserName.equalsIgnoreCase(username)){
                //System.out.println("Fail - username is incorrect");
          //  }else {
            //  System.out.println("Fail - password is incorrect");


            }
        }


    }
