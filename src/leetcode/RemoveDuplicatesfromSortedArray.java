package leetcode;

public class RemoveDuplicatesfromSortedArray {


    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int tmp = nums[0];
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != tmp) {
                tmp = nums[i];
                nums[j++] = nums[i];
            }
        }
        return j;
    }

}
