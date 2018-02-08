package leetcode;

/**
 * 34. Search for a Range
 *
 * @author Monster
 * @date 2017/12/4
 */
public class SearchforaRange {

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
                while (low > 0 && nums[low - 1] == nums[mid]) {
                    low--;
                }
                while (high < nums.length - 1 && nums[high + 1] == nums[high]) {
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
