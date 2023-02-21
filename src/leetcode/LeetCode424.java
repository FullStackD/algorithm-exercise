package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 424. 替换后的最长重复字符
 */
public class LeetCode424 {

    public int characterReplacement(String s, int k) {
        if (s.length() <= 1) {
            return s.length();
        }
        Map<Character, Integer> countMap = new HashMap<>();
        int left = 0;
        int maxF = 0; // 字符最大出现次数
        int result = 0;
        for (int right = 0; right < s.length(); right++) {
            countMap.put(s.charAt(right), countMap.getOrDefault(s.charAt(right), 0) + 1);
            maxF = Math.max(maxF, countMap.get(s.charAt(right)));
            if ((right - left + 1) - maxF <= k) {
                result = Math.max(result, right - left + 1);
            } else {
                countMap.put(s.charAt(left), countMap.get(s.charAt(left)) - 1);
                left++;
            }
        }
        return result;
    }

}
