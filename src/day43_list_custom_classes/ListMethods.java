package day43_list_custom_classes;

import java.util.*;


public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays());
        System.out.println("getDays().size()= " +getDays().size());
        System.out.println("getDays().get(0)= " +getDays().get(0));

        List<String> dayNames = getDays();
        System.out.println("dayNames = " + dayNames);
       dayNames.add("java day");
// removeIf method - java8 -> accepts lambda - and easy to remove without loop
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after removeIf = " + dayNames);

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90); // remove nums less than 90
        System.out.println("nums = " + nums);

    }


    public static List<String> getDays() {
       // List<String> days = new ArrayList<>(Arrays.asList("Monday, Tuesday, Wednesday," +
         //       "Thursday, Friday, Saturday, Sunday"));
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday");days.add("Thursday");
        days.add("Friday"); days.add("Saturday"); days.add("Sunday");

        return days;

    }


   public static List <Integer> getRandomList(int size){
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i<=size; i++) {// or if i=0; i<=size
            //int n = random.nextInt(101);
           // if(!nums.contains(n)){
             //   nums.add(n);
            //}
            nums.add(random.nextInt(101));//generate random number and add to list
        }
        return nums;




        }

    }


