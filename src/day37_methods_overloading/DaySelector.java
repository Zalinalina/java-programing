package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));

        System.out.println();

        for( int i = 1; i <= 8; i++) {
            System.out.println(i + " = " + getDayName(i));



        }
     String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if(someDay == null) {
            System.out.println("Someday is null for invalid day");
        }
        System.out.println(getDayNameV2(2));

    }
    public static String getDayName(int day) {
        switch (day) {
            case 1:return "Monday";
                //System.out.println("Monday");
               // break;//unreachable code, because return already exits the method
            case 2:return "Tuesday";
               // System.out.println("Tuesday");
               // break;
            case 3:return "Wednesday";
               // System.out.println("Wednesday");
               // break;
            case 4:return "Thirsday";
               // System.out.println("Thirsday");
               // break;
            case 5:return "Friday";
               // System.out.println("Friday");
              //  break;
            case 6:return "Saturday";
               // System.out.println("Saturday");
               // break;
            case 7:return "Sunday";
              //  System.out.println("");
              //  break;
            default:
                System.out.println("Invalid number - " + day);
                return null;// nothing no object

        }



        }
        public static String getDayNameV2(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thirsday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";break;
            default:
                System.out.println("Invalid day -" + day);
                dayName = null;
        }
        return dayName;

        }



    }





