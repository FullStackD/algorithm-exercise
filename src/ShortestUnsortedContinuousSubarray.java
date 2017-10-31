/**
 * 581. Shortest Unsorted Continuous Subarray
 *
 * @author Monster
 * @date 2017/10/31
 */
public class ShortestUnsortedContinuousSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            if (haslowerNum(nums[i], nums, i + 1)) {
                break;
            }
            i++;
        }
        while (i < j) {
            if (hasHigherNum(nums[j], nums, j - 1)) {
                break;
            }
            j--;
        }
        return i == j ? 0 : j - i + 1;
    }

    private boolean haslowerNum(int num, int[] nums, int i) {
        for (; i < nums.length; i++) {
            if (num > nums[i]) {
                return true;
            }
        }
        return false;
    }

    private boolean hasHigherNum(int num, int[] nums, int i) {
        for (; i >= 0; i--) {
            if (num < nums[i]) {
                return true;
            }
        }
        return false;
    }

    public int findUnsortedSubarray2(int[] nums) {
        int i = 0, j = -1, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        // [1, 3, 2, 4, 5]
        for (int l = 0, r = nums.length - 1; r >= 0; l++, r--) {
            //找到右边第一个非升序索引
            max = Math.max(max, nums[l]);
            if (nums[l] != max) {
                j = l;
            }
            //找到左边第一个非升序索引
            min = Math.min(min, nums[r]);
            if (nums[r] != min) {
                i = r;
            }
        }

        return (j - i + 1);
    }

}
