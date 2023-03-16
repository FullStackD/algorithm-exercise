package leetcode;

import java.util.List;

/**
 * 139. 单词拆分
 */
public class LeetCode139 {

    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        // 0~i的子串是否可以拼接出
        boolean[] f = new boolean[n + 1];
        f[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && wordDict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[n];
    }

}
