package leetcode;

import java.util.HashSet;

/**
 * 128. 最长连续序列（#）
 * 要求算法的时间复杂度为 O(n)。
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            //只对nums[i]作为连续序列的第一个数字去找对应的最长序列
            if (!set.contains(nums[i] - 1)) {
                int currentNum = nums[i];
                while (set.contains(currentNum)) {
                    currentNum++;
                }
                ans = Math.max(ans, currentNum - nums[i]);
            }
        }
        return ans;
    }

}
