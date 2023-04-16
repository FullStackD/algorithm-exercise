package leetcode;

/**
 * 剑指 Offer 03. 数组中重复的数字
 */
public class SwordPointOffer3 {

    public int findRepeatNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i]) {
                return nums[i];
            }
            // 把当前数字放置到它的正确位置上
            int temp = nums[i];
            nums[i] = nums[temp];
            nums[temp] = temp;
        }
        return -1;
    }
}
