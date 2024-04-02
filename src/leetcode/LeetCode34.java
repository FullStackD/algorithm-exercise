package leetcode;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 */
public class LeetCode34 {

    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid;
                high = mid;
                while (low > 0 && nums[low - 1] == target) {
                    low--;
                }
                while (high < nums.length - 1 && nums[high + 1] == target) {
                    high++;
                }
                return new int[]{low, high};
            }
        }
        if (nums[low] == target && low == high) {
            return new int[]{low, low};
        }
        return new int[]{-1, -1};
    }

}
