package leetcode;

/**
 * 162. 寻找峰值
 */
public class LeetCode162 {

    /**
     * 找到一个局部最大值
     *
     * @param nums 无序数组
     * @return 其中一个最大值的索引
     */
    public int findPeakElement(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int mid = 0;
        while (i <= j) {
            mid = i + (j - i) / 2;
            if ((mid == 0 || nums[mid] > nums[mid - 1]) && (mid == nums.length - 1 || nums[mid] > nums[mid + 1])) {
                return mid;
            } else if (mid > 0 && nums[mid] < nums[mid - 1]) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }
        return mid;
    }

}
