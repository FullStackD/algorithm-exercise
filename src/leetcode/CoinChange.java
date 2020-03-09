package leetcode;

import java.util.Arrays;


/**
 * 322. 零钱兑换(#)
 * <p>
 * 动态规划（自下而上）
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int max = amount + 1;//初始最大值，便于后续更新
        int[] dp = new int[amount + 1];//记录i元最少硬币数
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }


}
