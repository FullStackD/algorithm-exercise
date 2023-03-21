package leetcode;

/**
 * 55. 跳跃游戏
 */
public class LeetCode55 {

    public boolean canJump(int[] nums) {
        int len = nums.length;
        int k = 0;//当前能到达最远位置
        for (int i = 0; i < len; i++) {
            // 当前位置能到达&当前位置+跳数>最远位置，更新能到达的最远位置
            if (k >= i && i + nums[i] > k) {
                k = i + nums[i];
            }
        }
        // 能到达的最远位置是否大于等于最后一个下标
        return k >= len - 1;
    }

}
