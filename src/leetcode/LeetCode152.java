package leetcode;

import java.util.Arrays;

/**
 * 152. 乘积最大子数组
 */
public class LeetCode152 {

    public int maxProduct(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        // 以 nums[i] 结尾的连续子序列的乘积的最大值
        int[] maxDp = new int[n];
        // 以 nums[i] 结尾的连续子序列的乘积的最小值
        int[] minDp = new int[n];

        maxDp[0] = nums[0];
        minDp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] >= 0) {
                maxDp[i] = Math.max(nums[i], maxDp[i - 1] * nums[i]);
                minDp[i] = Math.min(nums[i], minDp[i - 1] * nums[i]);
            } else {
                maxDp[i] = Math.max(nums[i], minDp[i - 1] * nums[i]);
                minDp[i] = Math.min(nums[i], maxDp[i - 1] * nums[i]);
            }
        }
        return Arrays.stream(maxDp).max().getAsInt();
    }

}
