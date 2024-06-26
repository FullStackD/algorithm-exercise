package leetcode;

/**
 * 5. 最长回文子串
 */
public class LeetCode5 {

    public String longestPalindrome(String s) {
        int maxlen = 0;// 最长回文子串的长度
        int start = 0; // 最长回文子串的起始坐标
        for (int i = 0; i < s.length(); i++) {
            int cur = Math.max(getLen(s, i, i),
                    getLen(s, i, i + 1));
            if (cur > maxlen) {
                maxlen = cur;
                start = i - (cur - 1) / 2;
            }
        }
        return s.substring(start, start + maxlen);
    }


    /**
     * 求从s[l, r]开始扩散的最大回文串长度
     *
     * @param s
     * @param l
     * @param r
     * @return
     */
    private int getLen(String s, int l, int r) {
        while (l >= 0 && r < s.length() &&
                s.charAt(l) == s.charAt(r)) {
            --l;
            ++r;
        }
        return r - l - 1;
    }

}
