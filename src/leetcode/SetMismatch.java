package leetcode;

/**
 * 645. 错误的集合
 */
public class SetMismatch {

    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] < 0) {
                dup = index;
            } else {
                nums[index - 1] *= -1;
            }
        }

        int miss = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                miss = i + 1;
                break;
            }
        }
        return new int[]{dup, miss};
    }

}
