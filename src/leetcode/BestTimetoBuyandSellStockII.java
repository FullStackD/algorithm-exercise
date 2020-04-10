package leetcode;

/**
 * 122. 买卖股票的最佳时机 II
 */
public class BestTimetoBuyandSellStockII {

    /**
     * 当天卖出以后，当天还可以买入
     * 所以算法可以直接简化为只要今天比昨天大，就卖出。
     */
    public int maxProfit(int[] prices) {
        int res = 0, n = prices.length;
        for (int i = 0; i < n - 1; ++i) {
            if (prices[i] < prices[i + 1]) {
                res += prices[i + 1] - prices[i];
            }
        }
        return res;
    }

}
