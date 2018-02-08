package leetcode;

import java.util.List;

/**
 * 139. Word Break
 *
 * @author Monster
 * @date 2017/12/14
 */
public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && wordDict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }

}
