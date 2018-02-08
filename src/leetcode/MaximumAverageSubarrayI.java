package leetcode;

public class MaximumAverageSubarrayI {

    public double findMaxAverage(int[] nums, int k) {
        int j = 0;
        int max = Integer.MIN_VALUE;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= k - 1) {
                tmp += nums[i];
                max = Math.max(max, tmp);
                tmp -= nums[j];
                j++;
            } else {
                tmp += nums[i];
            }
        }
        return (double) max / k;
    }

}
