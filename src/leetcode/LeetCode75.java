package leetcode;

/**
 * 75. 颜色分类
 */
public class LeetCode75 {

    public void sortColors(int[] nums) {
        int i = 0;
        int right = nums.length - 1;
        int left = 0;
        while (i <= right) {
            if (nums[i] == 0) {
                swap(nums, left++, i++);
            } else if (nums[i] == 2) {
                swap(nums, right--, i);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }


}
