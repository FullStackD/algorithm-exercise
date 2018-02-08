package leetcode;

/**
 * 680. Valid Palindrome II
 *
 * @author Monster
 * @date 2017/11/6
 */
public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j && s.charAt(i) == s.charAt(j)) {
            i++;
            j--;
        }
        if (i < j) {
            return validPalindrome(s, i + 1, j) || validPalindrome(s, i, j - 1);
        } else {
            return true;
        }
    }

    private boolean validPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

}
