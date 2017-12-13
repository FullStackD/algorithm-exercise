import java.util.HashSet;

/**
 * 128. Longest Consecutive Sequence
 *
 * @author Monster
 * @date 2017/12/13
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums) {
            set.add(num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int j = nums[i];
                while (set.contains(j)) {
                    j++;
                }
                if (ans < j - nums[i]) {
                    ans = j - nums[i];
                }
            }
        }
        return ans;
    }

}
