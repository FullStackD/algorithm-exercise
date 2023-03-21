package leetcode;

/**
 * 53. 最大子数组和
 */
public class LeetCode53 {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            // 以当前元素为结尾的连续子数组的最大和
            sum = Math.max(num, num + sum);
            // 不断更新最大和
            res = Math.max(res, sum);
        }
        return res;
    }

}
