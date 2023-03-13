package leetcode;

/**
 * 647. 回文子串
 */
public class LeetCode647 {

    /**
     * DP解法
     *
     * @param s
     * @return
     */
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int count = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    // 【单字符】或【去除两边字符的子串是回文串】
                    if (j - i <= 1 || dp[i + 1][j - 1]) {
                        count++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return count;
    }

    private int count = 0;

    /**
     * 中心扩展法，遍历所有可能的回文中心
     *
     * @param s
     * @return
     */
    public int countSubstringsV2(String s) {
        for (int i = 0; i < s.length(); i++) {
            count(s, i, i);//回文串长度为奇数
            count(s, i, i + 1);//回文串长度为偶数
        }
        return count;
    }

    /**
     * 计算给定回文中心在字符串s中的回文子串数量
     *
     * @param s     字符串
     * @param start 回文中心起点
     * @param end   回文中心终点
     */
    private void count(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            count++;
            start--;
            end++;
        }
    }

}
