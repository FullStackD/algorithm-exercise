package leetcode;

/**
 * 53. 最大子序和
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                //可以为后续最大子序和提供增益
                sum += num;
            } else {
                //无法为后面提供最大子序和
                sum = num;
            }
            res = Math.max(res, sum);
        }
        return res;
    }

}
