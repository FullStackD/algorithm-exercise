package leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * 140. Word Break II
 *
 * @author Monster
 * @date 2017/12/18
 */
public class WordBreakII {


    public List<String> wordBreak(String s, List<String> wordDict) {
        return DFS(s, wordDict, new HashMap<>());
    }

    private List<String> DFS(String s, List<String> wordDict, HashMap<String, LinkedList<String>> map) {
        if (map.containsKey(s)) {
            return map.get(s);
        }

        LinkedList<String> res = new LinkedList<>();
        if (s.length() == 0) {
            res.add("");
            return res;
        }
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<String> sublist = DFS(s.substring(word.length()), wordDict, map);
                for (String sub : sublist) {
                    res.add(word + (sub.isEmpty() ? "" : " ") + sub);
                }
            }
        }
        map.put(s, res);
        return res;
    }

}
