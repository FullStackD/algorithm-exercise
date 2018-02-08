package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 677. Map Sum Pairs
 *
 * @author Monster
 * @date 2017/11/17
 */
public class MapSumPairs {

    class MapSum {
        private Map<String, Integer> map;
        private Map<String, Integer> original;

        /**
         * Initialize your data structure here.
         */
        public MapSum() {
            map = new HashMap<>();
            original = new HashMap<>();
        }

        public void insert(String key, int val) {
            int diff = val - original.getOrDefault(key, 0);
            String str = "";
            for (char c : key.toCharArray()) {
                str += c;
                map.put(str, map.getOrDefault(str, 0) + diff);
            }
            original.put(key, original.getOrDefault(key, 0) + diff);
        }

        public int sum(String prefix) {
            return map.getOrDefault(prefix, 0);
        }
    }

}
