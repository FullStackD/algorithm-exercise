package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. 最小覆盖子串
 */
public class LeetCode76 {

    public static String minWindow(String s, String t) {
        if (t.equals("")) {
            return "";
        }
        Map<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        Map<Character, Integer> countWindow = new HashMap<>();

        int have = 0;
        int need = countT.size();

        int left = 0;
        int right = 0;
        int reslength = 0;
        int resLeft = 0;
        int resRight = 0;
        for (; right < s.length(); right++) {
            char c = s.charAt(right);
            countWindow.put(c, countWindow.getOrDefault(c, 0) + 1);
            if (countT.containsKey(c) && countWindow.get(c).equals(countT.get(c))) {
                have++;
            }
            while (have == need) {
                // update our result
                if (reslength == 0 || right - left + 1 < reslength) {
                    resLeft = left;
                    resRight = right;
                    reslength = right - left + 1;
                }
                char leftC = s.charAt(left);
                // pop from the left of our window
                countWindow.put(leftC, countWindow.get(leftC) - 1);
                if (countT.containsKey(leftC) && countWindow.get(leftC) < countT.get(leftC)) {
                    have--;
                }
                left++;
            }
        }
        return reslength == 0 ? "" : s.substring(resLeft, resRight + 1);
    }

}
