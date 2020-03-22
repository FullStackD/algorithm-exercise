package lintcode.sword;

import java.util.Arrays;

/**
 * 面试题03. 数组中重复的数字
 * 注：长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内
 */
public class FindRepeatNumber {

    //空间优先
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }

    //时间优先
    public int findRepeatNumber2(int[] nums) {
        int[] f = new int[nums.length];
        for (int num : nums) {
            f[num]++;
            if (f[num] > 1) {
                return num;
            }
        }
        return 0;
    }
}
