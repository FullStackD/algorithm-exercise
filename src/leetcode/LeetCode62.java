package leetcode;

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

}
