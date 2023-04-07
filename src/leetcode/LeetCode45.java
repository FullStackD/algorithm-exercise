package leetcode;

/**
 * 45. 跳跃游戏 II
 */
public class LeetCode45 {

    public int jump(int[] nums) {
        int n = nums.length;
        int jumps = 0;
        // 本次jump最远位置
        int currentEnd = 0;
        // 本次jump中能跳到的最远端
        int farthest = 0;
        for (int i = 0; i < n - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }

}
