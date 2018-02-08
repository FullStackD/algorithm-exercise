package leetcode;

public class MinimumMovestoEqualArrayElements {

    public int minMoves(int[] nums) {
        // sum + m * (n - 1) = x * n
        // x = minNum + m
        // sum - minNum * n = m
        int m;
        int minNum = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minNum) {
                minNum = nums[i];
            }
            sum += nums[i];
        }
        m = sum - minNum * nums.length;
        return m;
    }

}
