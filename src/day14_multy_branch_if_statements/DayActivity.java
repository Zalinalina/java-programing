package day14_multy_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {

        String weather = "Snowy";//, "rainy", "snowy", "windy";
        if (weather.equals("Sunny")) {
            System.out.println(weather + " - Go to park. hiking, and code java");
        } else if (weather.equals("Rainy")) {
            System.out.println(weather + " - Stay home, drink tea and code java");
        } else if (weather.equals("Snowy")) {
            System.out.println(weather + " - Clean the car then build snowman, drink hot chocolate");
        } else if (weather.equals("Windy")) {
            System.out.println(weather + (weather + " - Get ready for power loss, fly a kite, and code java"));
        } else {

            System.out.println("just keep coding java");


        }
    }
}