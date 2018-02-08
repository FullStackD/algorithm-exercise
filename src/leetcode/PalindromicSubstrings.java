package leetcode;

/**
 * 647. Palindromic Substrings
 *
 * @author Monster
 * @date 2017/11/22
 */
public class PalindromicSubstrings {

    public int countSubstrings(String s) {
        int len = 1;
        int count = 0;
        while (len <= s.length()) {
            for (int i = 0; i < s.length() && i + len <= s.length(); i++) {
                if (isPalindrom(s.substring(i, i + len))) {
                    count++;
                }
            }
            len++;
        }
        return count;
    }

    public boolean isPalindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
