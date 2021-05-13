package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10; //single variable
        int[] nums = new int[3];//array variable
        nums [0] = 5;
        nums [1] = 7;
        nums [2] = 10;// wecant put 0.1 because int
      //  nums[3] = 100;// out of bounce because we try to store only 3 items
         //print values of array

       // System.out.println(nums);we dont need
        System.out.println("Value of index 0 = " +nums[0]);//5 first number
        System.out.println("Value of index 1 = " + nums[1]);//7
        System.out.println("Value of index 1 = " + nums[2]);//10

        int i = 0;
        System.out.println(nums[i]);
        i++;
        System.out.println(nums [i]);

        System.out.println("number of elements = " + nums.length);
        //store length of array into len variable
        int len = nums.length;
        System.out.println("len = " + len);

        //change values
        nums[0]=100;
        nums[1]=300;
        //read the value of index one and assign to index two
        nums[2]=nums[1];


        System.out.println("nums[0] = " + nums[0]);//100
        System.out.println("nums[1] = " + nums[1]);//300
        System.out.println("nums[2] = " + nums[2]);//300



    }
}
