import java.util.*;

/**
 * 49. Group Anagrams
 *
 * @author Monster
 * @date 2017/12/6
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] tmpArr = str.toCharArray();
            Arrays.sort(tmpArr);
            String key = new String(tmpArr);
            if (map.get(key) == null) {
                List<String> list = new ArrayList<>();
                map.put(key, list);
                list.add(str);
            } else {
                map.get(key).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }

}
