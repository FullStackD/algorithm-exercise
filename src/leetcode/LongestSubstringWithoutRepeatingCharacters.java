package leetcode;

import java.util.HashMap;

/**
 * 3. Longest Substring Without Repeating Characters
 *
 * @author Monster
 * @date 2017/11/23
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        //最近一次字符位置
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int max = 0;
        //滑动窗口
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                //更新起始点
                start = Math.max(start, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - start + 1);
        }
        return max;
    }

}
