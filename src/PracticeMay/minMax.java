package PracticeMay;

public class minMax {
    public static void main(String[] args) {

        int[] nums = { 4, 781, 8, 99, 103,1, 1100};
        System.out.println(max(nums));
        System.out.println(min(nums));

    }
    public static int max(int [] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
                // max
            }
        }
            return max;

        }
    public static int min (int [] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                // max
            }
        }
        return min;
    }
    }