import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 *
 * @author Monster
 * @date 10/18/2017
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }
        return map.values().size() == new HashSet<>(map.values()).size();
    }

}
