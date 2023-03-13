package leetcode;

/**
 * 91. 解码方法
 */
public class LeetCode91 {

    public int numDecodings(String s) {
        // 前n个字符的解码方案数
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        // 处理前导0的用例
        s = " " + s;
        for (int i = 1; i <= n; i++) {
            int a = s.charAt(i) - '0';
            int b = (s.charAt(i - 1) - '0') * 10 + (s.charAt(i) - '0');
            //若a是0，无法单独解码
            if (1 <= a && a <= 9) {
                dp[i] = dp[i - 1];
            }
            // 0X也不能单独解码，故b必须>=10
            if (10 <= b && b <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }

}
