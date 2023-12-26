package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 567. 字符串的排列
 */
public class LeetCode567 {

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int valid = 0;
        int left = 0;
        int right = 0;
        while (right < s2.length()) {
            char c = s2.charAt(right++);
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
                if (window.get(c).equals(need.get(c))) {
                    valid++;
                }
                if (valid == need.size()) {
                    return true;
                }
            }

            while (left < right && right - left >= s1.length()) {
                char d = s2.charAt(left++);
                if (need.containsKey(d)) {
                    if (need.get(d).equals(window.get(d))) {
                        valid--;
                    }
                    window.put(d, window.getOrDefault(d, 0) - 1);
                }
            }
        }
        return false;
    }

}
