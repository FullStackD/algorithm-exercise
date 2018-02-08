package leetcode;

/**
 * 303. Range Sum Query - Immutable
 *
 * @author Monster
 * @date 2017/11/2
 */
public class RangeSumQueryImmutable {

    class NumArray {

        private int[] arr;

        public NumArray(int[] nums) {
            if (nums != null && nums.length > 0) {
                arr = new int[nums.length];
                arr[0] = nums[0];
                for (int i = 1; i < nums.length; i++) {
                    arr[i] = arr[i - 1] + nums[i];
                }
            }
        }

        public int sumRange(int i, int j) {
            return arr[j] - (i == 0 ? 0 : arr[i - 1]);
        }

    }

}
