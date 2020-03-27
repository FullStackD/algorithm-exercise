package lintcode.sword;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题38. 字符串的排列(#)
 */
public class Permutation {

    private Set<String> result = new HashSet<>();

    /**
     * 回溯算法
     * def backtrack(路径，选择列表):
     *     if 满足结束条件：
     *         result.add(路径)
     *         return
     *     for 选择 in 选择列表:
     *         做选择
     *         backtrack(路径，选择列表)
     *         撤销选择
     */
    public String[] permutation(String s) {

        int n = s.length();
        if (n == 0) {
            return new String[]{};
        }
        int[] visited = new int[n];
        backtrack(s, "", visited);
        return result.toArray(new String[n]);
    }

    private void backtrack(String s, String now, int[] visited) {
        if (now.length() == s.length()) {
            result.add(now);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (visited[i] == 1) {
                continue;
            }
            visited[i] = 1;
            backtrack(s, now + temp, visited);
            visited[i] = 0;
        }
    }


}
