package Replitts.Methods;
import  java.util.*;
public class AddtoArray {




       //  Scanner scan = new Scanner(System.in);

/*
        int size = scan.nextInt();
        int[] num = {2, 3, 4, 5};
        num[0] = 3;
        num[1] = 5;

        for (int i =0; i < num.length; i++) {
            num[i] = scan.nextInt();
        }
        int num2 = 7;
        int [] numbers = {2, 3, 4, 5, 7};
        addTOArr(num,  num2);
    }
    public static void addTOArr (int[] original, int number){

        int [] result = new int [original.length + 1];   //{0,0,0,0,0}
        // {2,3,4,5}
        // {0,0,0,0,0}
        for(int i = 0; i < result.length; i++){
            // result[0] = original[0];
            // result[1] = original[1];
            // result[2] = original[2];
            //  result[3] = original[3];
            //  result[4] = original[4];// out of bound

            result[i] = original[i];//out of bound

            if(i < result.length - 1) {
                result[i] = original[i];

            }else {//we are in the last round loop// i ==4
                result[i] =number;
            }
        }
        System.out.println(Arrays.toString(result));

 */


        public static void add_to_r(int[] r,int n) {
            // size = 4
            // int[] arr = {2, 3, 4, 5} ;
            // n = 6;
            // int [] newr = {2, 3, 4, 5, 6}
            //create new array with one more position.
            int [] newr = new int [r.length + 1];
            // int [] newr = {0, 0, 0, 0, 0};

            for(int i=0 ; i < newr.length ; i++){ // length is 5
                // i = 0, 1, 2, 3, 4
                // n
                //  [0, 1, 2, 3 + 4]
                // {2, 3, 4, 5} + n} ==> original array
                //  {0, 0, 0, 0 + 0} ==> new Array
                //.    (   if  ) else
                // i = (0 1 2 3)  4
                if(i< newr.length -1) // (i < 4)
                    newr[i] = r[i];

                else
                    newr[i] = n;
            }
            System.out.println(Arrays.toString(newr));
        }

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int size = inp.nextInt(), n = inp.nextInt();
            int[] arr = new int[size];
            for(int i=0 ; i <=size-1; i++){
                arr[i]=inp.nextInt();
            }

            add_to_r(arr, n);

        }
    }

// size = 5
// {4, 5, 6, 7, 8}
// addithonal number = 10
// use costom method in order to combine the array with number
//
// declare a new array with size of original + 1
// new array : {0, 0, 0, 0, 0, 0}
// use for loop to insert value of original arry into new one
// problem : the original array is one shorter than new one
// we need condition
// if match the original array to new array
// and place to number
// another if condition
// when we are in last index of new array
// add addithonal number to last index



