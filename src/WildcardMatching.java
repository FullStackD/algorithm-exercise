/**
 * 44. Wildcard Matching
 *
 * @author Monster
 * @date 2017/12/11
 */
public class WildcardMatching {

    /**
     * 通配符匹配
     *
     * @param s 带匹配字符串
     * @param p 支持'*'和'?'的正则表达式
     * @return
     */
    public boolean isMatch(String s, String p) {
        int i = 0;
        int j = 0;
        int star = -1;//*号索引，用于回退
        int mark = -1;//上次匹配到的s的索引
        while (i < s.length()) {
            if (j < p.length() && matchChar(s.charAt(i), p.charAt(j))) {
                i++;
                j++;
            } else if (j < p.length() && p.charAt(j) == '*') {
                star = j;
                //优先用 * 匹配空字符
                j++;
                mark = i;
            } else if (star != -1) {
                j = star + 1;
                i = ++mark;
            } else {
                return false;
            }
        }
        //处理多余的'*'
        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }
        return j == p.length();
    }

    private boolean matchChar(char c, char p) {
        return p == '?' || p == c;
    }

}

