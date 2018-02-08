package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 676. Implement Magic Dictionary
 *
 * @author Monster
 * @date 2017/11/22
 */
public class MagicDictionary {

    private Map<String, Set<Character>> map;

    /**
     * Initialize your data structure here.
     */
    public MagicDictionary() {
        map = new HashMap<>();
    }

    /**
     * Build a dictionary through a list of words
     */
    public void buildDict(String[] dict) {
        for (String str : dict) {
            for (int i = 0; i < str.length(); i++) {
                String key = str.substring(0, i) + "_" + str.substring(i + 1);
                Set set = map.getOrDefault(key, new HashSet<>());
                set.add(str.charAt(i));
                map.put(key, set);
            }
        }
    }

    /**
     * Returns if there is any word in the trie that equals to the given word after modifying exactly one character
     */
    public boolean search(String word) {
        for (int i = 0; i < word.length(); i++) {
            String key = word.substring(0, i) + "_" + word.substring(i + 1);
            Set<Character> set = map.get(key);
            if (set != null) {
                // 若存在 apply和apple 类型的数据 return true
                if (!set.contains(word.charAt(i)) || set.size() > 1) {
                    return true;
                }
            }
        }
        return false;
    }

}
