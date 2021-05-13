package ReplitArray.SaimsTask2;

import java.util.Arrays;

public class SaimsTaskEvenorOdd {
    public static void main(String[] args) {
        int[] nums = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int even = 0;
        int odd = 0;
        for (int each : nums) {
            if (each % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

                int[] evenNumber = new int[even];
                int[] oddNumber = new int[odd];
                for (int i = 0, e = 0, o = 0; i < nums.length; i++) {
                    if (nums[i] % 2 == 0) {
                        evenNumber[e++] = nums[i];
                    } else {
                        oddNumber[o++] = nums[i];

                    }

                }

                System.out.println(Arrays.toString(evenNumber));
        System.out.println(Arrays.toString(oddNumber));
            }
        }

