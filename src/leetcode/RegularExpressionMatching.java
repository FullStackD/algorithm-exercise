package leetcode;

/**
 * 10. Regular Expression Matching
 *
 * @author Monster
 * @date 2017/12/7
 */
public class RegularExpressionMatching {


    /**
     * @param s 待校验字符串
     * @param p 正则表达式（支持'.'和'*'
     * @return
     */
    public boolean isMatch(String s, String p) {
        if (p.length() == 0) {
            return s.length() == 0;
        }

        if (p.length() == 1 || p.charAt(1) != '*') {
            return s.length() >= 1 && (p.charAt(0) == '.' || s.charAt(0) == p.charAt(0)) && isMatch(s.substring(1), p.substring(1));
        }

        int len = s.length();
        int i = -1;
        while (i < len && (i < 0 || p.charAt(0) == '.' || p.charAt(0) == s.charAt(i))) {
            if (isMatch(s.substring(i + 1), p.substring(2))) {
                return true;
            }
            i++;
        }
        return false;
    }


}
