package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123");// positive test, sunny day
        loginVoid("cybertek", "answer");// negative test, rainy day scenario
        loginVoid("", "");

       // System.out.println(loginVoid("cybertekStudent", "abc123"));//error because void method no return value
        System.out.println(login("cybertekStudent", "abc123"));

        //if(loginVoid("", ""){//doesnt work
        if(login("cybertekStudent", "abc123")) {
            System.out.println("Login successful, welcome to Canvas");
            System.out.println("Select the course to continiue");
            System.out.println("Login Failed");
        }
        boolean isLoginSuccess = login("nadir", "mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);
        if(login("nadir", "mountain")) {
            System.out.println("Welcome to Canvas, select course or calendar");
        }else {
            System.out.println("Something wrong");
        }


    }

    public static void loginVoid(String username, String password) {

        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login Successful, welcome cybertekStudent");
        } else {
            System.out.println("Incorrect username or password\n" +
                    "You do not have permission to send messages in this channel.");


        }

/*
method:
    loginVoid
params:
    String username, String password

return type:
    VOID

in the method:
    Declare : String secretUsername ="cybertekStudent", secretPassword = "abc123"

if(both match)
    PRINT:
        Login Successful, welcome cybertekStudent
ELSE
    PRINT:
        Incorrect username or password
You do not have permission to send messages in this channel.

 */

    }

    public static boolean login(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
      //  if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            //return true;// return true and exit method here
      //  } else {
          //  return false;
        return  username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword) ;
        }

    }
