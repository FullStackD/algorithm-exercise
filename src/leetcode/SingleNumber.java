package leetcode;

/**
 * 136. 只出现一次的数字
 * 任何数异或0仍然为该数
 * 相同的数异或为0
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res = res ^ i;
        }
        return res;
    }

}
