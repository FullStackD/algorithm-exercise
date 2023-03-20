package leetcode;

/**
 * 1143. 最长公共子序列
 */
public class LeetCode1143 {

    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    // if the characters match, add 1 to the length of the longest common subsequence
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // if the characters don't match, take the maximum of the length of the longest common subsequence of the two substrings
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

}
