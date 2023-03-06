package leetcode;

/**
 * 198. 打家劫舍
 */
public class LeetCode198 {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        int[] price = new int[length];
        price[0] = nums[0];
        price[1] = Math.max(nums[1], nums[0]);
        for (int i = 2; i < length; i++) {
            price[i] = Math.max(price[i - 1], price[i - 2] + nums[i]);
        }
        return price[length - 1];
    }

}
