package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 *
 * @author Monster
 * @date 2017/11/6
 */
public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }

}
