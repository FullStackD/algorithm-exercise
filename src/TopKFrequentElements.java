import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 347. Top K Frequent Elements
 *
 * @author Monster
 * @date 2017/12/20
 */
public class TopKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {

        List<Integer>[] bucket = new List[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            int count = map.get(key);
            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(key);
        }

        List<Integer> res = new ArrayList<>();

        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
            if (bucket[pos] != null) {
                res.addAll(bucket[pos]);
            }
        }
        return res;
    }

}
