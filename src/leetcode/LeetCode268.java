package leetcode;

/**
 * 268. 丢失的数字
 */
public class LeetCode268 {

    public int missingNumber(int[] nums) {
        int xor = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }

}
