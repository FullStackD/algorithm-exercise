package leetcode;

/**
 * 238. 除自身以外数组的乘积
 */
public class LeetCode238 {

    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] answer = new int[length];

        // 求出当前数字的前面所有数的乘积存储到answer[i]
        answer[0] = 1;
        for (int i = 1; i < length; i++) {
            answer[i] = nums[i - 1] * answer[i - 1];
        }

        // answer*当前数字的后面所有数的乘积就是最终结果
        int R = 1;
        for (int i = length - 1; i >= 0; i--) {
            answer[i] = answer[i] * R;
            R *= nums[i];
        }
        return answer;
    }

}
