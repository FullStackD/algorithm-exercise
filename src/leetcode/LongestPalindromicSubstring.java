package leetcode;

/**
 * Author: Admin
 * Date: 2017/11/25 0025.
 */
public class LongestPalindromicSubstring {

    private int maxLen;
    private int start;

    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            extendPalidrome(s, i, i);
            extendPalidrome(s, i, i + 1);
        }
        return s.substring(start, start + maxLen);
    }

    private void extendPalidrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        if (maxLen < right - left - 1) {
            maxLen = Math.max(maxLen, right - left - 1);
            // get the index
            start = left + 1;
        }
    }

}
