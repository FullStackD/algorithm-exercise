package leetcode;

/**
 * 322. 零钱兑换(#)
 * <p>
 * 动态规划（自下而上）
 */
public class LeetCode322 {

    public int coinChange(int[] coins, int amount) {
        //初始最大值，便于后续更新
        int max = amount + 1;
        //记录i元最少硬币数
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            dp[i] = max;
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] == max ? -1 : dp[amount];
    }


}
