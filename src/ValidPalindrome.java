/**
 * 125. Valid Palindrome
 *
 * @author Monster
 * @date 10/27/2017
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low <= high) {
            if (!Character.isLetterOrDigit(s.charAt(low))) {
                low++;
            } else if (!Character.isLetterOrDigit(s.charAt(high))) {
                high--;
            } else if (Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high))) {
                return false;
            } else {
                low++;
                high--;
            }
        }
        return true;
    }

}
