package day20_string_manipulations;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.length() == 0);


        if (jobTitle.isEmpty()) {
            System.out.println("Job title is missing, please resend");
        } else {
            System.out.println("Job title looks good");
        }
        if (jobTitle.length() == 0) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("Job title is not empty");
        }
        System.out.println(jobTitle.equals(" "));//false because of space
        if ("".equals(jobTitle)) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("Job title is not empty");
        }

        String word = " ";
        System.out.println(word.isEmpty());// false because of space
        System.out.println(word.length());//1 because of space\\ blank space is a character


        String veggie = "carrots";
        System.out.println(veggie.isEmpty());//false
        if(!veggie.isEmpty()) {
            System.out.println("we have " + veggie);
        }

        String word2;
       // System.out.println(word2.isEmpty());//Error

    }
}
