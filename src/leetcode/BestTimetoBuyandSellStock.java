package leetcode;

/**
 * 121. 买卖股票的最佳时机
 */
public class BestTimetoBuyandSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 2, 1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
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

}

