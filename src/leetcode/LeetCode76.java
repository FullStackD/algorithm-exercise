package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. 最小覆盖子串
 */
public class LeetCode76 {

    public static String minWindow(String s, String t) {
        // 异常参数校验
        if (t.equals("") || s.equals("")) {
            return "";
        }
        Map<Character, Integer> need = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            need.put(t.charAt(i), need.getOrDefault(t.charAt(i), 0) + 1);
        }
        Map<Character, Integer> countWindow = new HashMap<>();
        // 窗口中的有效字符个数
        int valid = 0;

        // 维护一个左闭右开的区间
        int left = 0;
        int right = 0;
        // 记录最小覆盖子串的起始索引及长度
        int start = 0, len = Integer.MAX_VALUE;

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;
            // 进行窗口内数据的一系列更新
            if (need.containsKey(c)) {
                countWindow.put(c, countWindow.getOrDefault(c, 0) + 1);
                if (countWindow.get(c).equals(need.get(c))) {
                    valid++;
                }
            }

            while (valid == need.size()) {
                if (right - left < len) {
                    start = left;
                    len = right - left;
                }
                // 窗口左边界左移
                char leftC = s.charAt(left);
                left++;
                // 进行窗口内数据的一系列更新
                if (need.containsKey(leftC)) {
                    if (countWindow.get(leftC).equals(need.get(leftC))) {
                        valid--;
                    }
                    countWindow.put(leftC, countWindow.getOrDefault(leftC, 0) - 1);
                }
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }

}
