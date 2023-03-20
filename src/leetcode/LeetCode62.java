package leetcode;

/**
 * 62. 不同路径
 */
public class LeetCode62 {

    /**
     * 1. DP解法
     * 2. 排列组合问题（总共走m+n-2步，其中m-1步向下，n-1步向右 ）
     * 注意：直接求阶乘有溢出问题
     * (m+n-2)!/     =  n*(n+1)...(m+n-2)
     * (m-1)!(n-1)!  =  (m-1)*(m-2)...1
     *
     * @param m 行数
     * @param n 列数
     * @return
     */
    public int uniquePaths(int m, int n) {
        long ans = 1;
        for (int x = n, y = 1; y < m; ) {
            ans = ans * x / y;
            x++;
            y++;
        }
        return (int) ans;
    }

    /**
     * DP解法
     *
     * @param m
     * @param n
     * @return
     */
    public int uniquePathsWithDP(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];

    }

}
