package leetcode;

/**
 * 1143. 最长公共子序列
 */
public class LeetCode1143 {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        // dp[i][j] 表示 text1[0:i-1] 和 text2[0:j-1] 的最长公共子序列
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // 两个子字符串的最后一位相等，所以最长公共子序列又增加了 1
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // 两个子字符串的最后一位不相等，那么此时的状态 dp[i][j] 应该是 dp[i - 1][j] 和 dp[i][j - 1] 的最大值
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

}
