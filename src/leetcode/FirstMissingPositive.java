package leetcode;

/**
 * 41. First Missing Positive
 *
 * @author Monster
 * @date 2018/1/15
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] != (i + 1) && nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int t = nums[i];
                nums[i] = nums[t - 1];
                nums[t - 1] = t;
            } else {
                i++;
            }
        }
        for (i = 0; i < n; ++i) {
            if (nums[i] != (i + 1)) {
                return i + 1;
            }
        }
        return n + 1;
    }


}
