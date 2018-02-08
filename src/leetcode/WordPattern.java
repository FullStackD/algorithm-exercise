package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 290. Word Pattern
 *
 * @author Monster
 * @date 10/18/2017
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.get(pattern.charAt(i)) == null) {
                map.put(pattern.charAt(i), arr[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
            }
        }
        return map.keySet().size() == new HashSet(map.values()).size();
    }

}
