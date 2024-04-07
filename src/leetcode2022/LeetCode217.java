package leetcode2022;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素
 */
public class LeetCode217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
