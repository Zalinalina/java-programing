package MyPractice;

public class MaxandMin {
    public static void main(String[] args) {
        int[] numbers = {4, 15, 82, 789, 2, 45, 40};
        //System.out.println(max(numbers));
        System.out.println(SecondMax(numbers));

    }

    public static int SecondMax(int[] numbers) {


        int maxNum = numbers[0];
        int secondMax = numbers[0];
        for (int each: numbers) {
            if (each > maxNum) {
            secondMax = maxNum;
                maxNum = each;

            }
            if(each > secondMax && maxNum > each){
                secondMax = each;
            }
        }
        return secondMax;
    }






}

