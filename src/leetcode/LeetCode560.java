package leetcode;

/**
 * 560. 和为 K 的子数组
 */
public class LeetCode560 {


    /**
     * 暴力解法
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySum(int[] nums, int k) {
        // 计算前缀和数组sum[i]表示nums数组中i之前的所有元素的和
        int[] sums = new int[nums.length + 1];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (sums[j + 1] - sums[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * 利用前缀和快速求区间和
     *
     * @param nums
     * @param k
     * @return
     */
    public int subarraySumV2(int[] nums, int k) {
        int n = nums.length;
        int[] sums = new int[n + 1];
        sums[0] = 0;
        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i - 1] + nums[i - 1];
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (sums[j + 1] - sums[i] == k) {
                    count++;
                }
            }
        }
        return count;
    }

}
