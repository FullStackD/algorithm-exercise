package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 532. K-diff Pairs in an Array
 *
 * @author Monster
 * @date 2017/11/6
 */
public class KdiffPairsinanArray {

    public int findPairs(int[] nums, int k) {
        if (k < 0) {
            return 0;
        }
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                if (nums[i] == nums[i - 1]) {
                    continue;
                }
            }
            if (k != 0 && map.containsKey(nums[i] + k)) {
                count++;
            }
            if (k == 0 && map.get(nums[i]) > 1) {
                count++;
            }
        }
        return count;
    }

}
