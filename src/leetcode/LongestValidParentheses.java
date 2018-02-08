package leetcode;

/**
 * 32. Longest Valid Parentheses
 *
 * @author Monster
 * @date 2018/1/11
 */
public class LongestValidParentheses {

    public static int longestValidParentheses(String s) {
        int result = 0;
        s = ')' + s;
        int[] dp = new int[s.length()];
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                //解决(())的问题
                if (s.charAt(i - 1 - dp[i - 1]) == '(') {
                    dp[i] = dp[i - 1] + 2;
                }
                //解决()(())的问题
                dp[i] += dp[i - dp[i]];
            }
            result = Math.max(result, dp[i]);
        }
        return result;
    }

}
