package leetcode;

/**
 * 674. 最长连续递增序列
 */
public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = 1;
        int num = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                num++;
            } else {
                max = Math.max(num, max);
                num = 1;
            }
        }
        max = Math.max(num, max);
        return max;
    }

}
