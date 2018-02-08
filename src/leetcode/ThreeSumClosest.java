package leetcode;

import java.util.Arrays;

/**
 * 16. 3Sum Closest
 *
 * @author Monster
 * @date 2017/11/29
 */
public class ThreeSumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int sum = nums[low] + nums[high] + nums[i];
                if (min > Math.abs(sum - target)) {
                    min = Math.abs(sum - target);
                    result = sum;
                }
                if ((sum > target)) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }

}
