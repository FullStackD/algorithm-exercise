package leetcode;

/**
 * 31. Next Permutation
 *
 * @author Monster
 * @date 2017/12/8
 */
public class NextPermutation {

    /**
     * 求出下一个更大的排列（字典序）
     * 若 不存在更大的排列 修改为 最小的排列
     *
     * @param nums
     */
    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return;
        }
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--; // Find 1st id i that breaks descending order
        }
        //非完全降序
        if (i >= 0) {
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) {
                j--;           // Find rightmost first larger id j
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }


    private void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i++, j--);
        }
    }
}
