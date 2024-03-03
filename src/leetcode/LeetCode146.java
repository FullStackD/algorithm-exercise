package leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 146. LRU缓存机制
 */
public class LeetCode146 {

    class LRUCache {

        private Map<Integer, Integer> map;

        public LRUCache(int capacity) {
            map = new LinkedHashMap(capacity, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry eldest) {
                    return map.size() > capacity;
                }
            };
        }

        public int get(int key) {
            return map.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            map.put(key, value);
        }
    }

}
/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */