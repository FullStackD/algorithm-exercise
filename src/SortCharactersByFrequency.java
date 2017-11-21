import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 451. Sort Characters By Frequency
 *
 * @author Monster
 * @date 2017/11/21
 */
public class SortCharactersByFrequency {

    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(
                (o1, o2) -> o2.getValue() - o1.getValue()
        );
        pq.addAll(map.entrySet());
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            Map.Entry<Character, Integer> e = pq.poll();
            for (int i = 0; i < e.getValue(); i++) {
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }

}
