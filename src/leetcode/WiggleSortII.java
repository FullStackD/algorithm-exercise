package leetcode;

import java.util.Arrays;

/**
 * 324. 摆动排序 II（#）
 */
public class WiggleSortII {

    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int[] tmp = new int[nums.length];
        //分成两部分，每次从两部分的最后开始拿
        int end = nums.length - 1;
        //数组长度为奇数时，mid为最中间元素的下标
        //数组长度为偶数时，mid为最中间2个元素的第一个元素的下标
        int mid = (nums.length + 1) / 2 - 1;
        for (int i = 0; i < nums.length; i++) {
            int t = i % 2 == 0 ? nums[mid--] : nums[end--];
            tmp[i] = t;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }
    }

}
