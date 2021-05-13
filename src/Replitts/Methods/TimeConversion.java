package Replitts.Methods;

public class TimeConversion {
    public static void main(String[] args) {
militaryTime("09:20:55PM");
    }

    // input: 03:00:00 AM , output: 03:00:00
    // in: 04:34:44PM,  out: 16:34:44
    //in: 12:00:00AM, out: 00:00:00
    // in: 12:00:00, out: 12:00:00

    public static void militaryTime(String time) {

        String military = "";

        if (time.contains("AM")) {
            time = time.replace("AM", "");
            military = time;//03:00:00
            if (time.startsWith("12")) {
                time = time.replaceFirst("12", "00");
                military = time;
            }
            System.out.println(military);
        } else {
            time = time.replace("PM", "");
            if (time.startsWith("12")) {
                military = time; //12:00:00
            } else {
                String hour = time.substring(0, time.indexOf(":"));
                String[] timeArray = time.split(":");
                int hourInt = Integer.parseInt(timeArray[0]);
                hourInt += 12;
                timeArray[0] = "" + hourInt;
                timeArray[0] = Integer.toString(hourInt);

                timeArray[0] = Integer.toString(Integer.parseInt(timeArray[0]) + 12);

                military = String.join(":", timeArray);

                System.out.println(military);


            }
        }

    }
}