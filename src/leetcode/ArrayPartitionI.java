package leetcode;

import java.util.Arrays;

public class ArrayPartitionI {

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }
        return sum;
    }

}
