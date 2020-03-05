package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 */
public class TwoSum {

    //暴力枚举  时间O(n^2)
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }

    //使用哈希表  时间O(n) 空间O(n)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int t = target - nums[i];
            if (map.containsKey(t) && map.get(t) != i) {//不能重复利用这个数组中同样的元素。
                res[0] = i;
                res[1] = map.get(t);
            }
        }
        return res;
    }

    //进一步优化(1次遍历)
    public int[] twoSum3(int[] nums, int target) {
        //避免扩容，设定map容量(map默认容量16)
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            //先检查再put，保证不重复利用同样元素
            int t = target - nums[i];
            if (map.containsKey(t)) {
                return new int[]{i, map.get(t)};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
