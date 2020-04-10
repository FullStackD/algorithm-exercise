package leetcode;

/**
 * 121. 买卖股票的最佳时机
 */
public class BestTimetoBuyandSellStock {

    //用数组来记录最大卖出价
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        int res = 0;
        int n = prices.length;
        int[] max = new int[n];
        max[n - 1] = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            max[i] = Math.max(prices[i], max[i + 1]);
        }

        for (int i = 0; i < n - 1; i++) {
            int t = max[i + 1] - prices[i];
            if (t > 0) {
                res = Math.max(res, t);
            }
        }
        return res;
    }

    //用两个变量即可
    public int maxProfit2(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }
        int min = prices[0];//最小买入价
        int max = 0;//最大利润
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return max;
    }
}

