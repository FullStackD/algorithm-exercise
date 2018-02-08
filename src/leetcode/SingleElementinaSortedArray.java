package leetcode;

/**
 * 540. Single Element in a Sorted Array
 *
 * @author Monster
 * @date 2017/11/11
 */
public class SingleElementinaSortedArray {

    public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res ^= i;
        }
        return res;
    }

}
