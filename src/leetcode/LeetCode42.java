package leetcode;

/**
 * 42. 接雨水
 */
public class LeetCode42 {

    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int left = 0;
        int right = height.length - 1;
        while (height[left] == 0) {
            left++;
        }
        while (height[right] == 0) {
            right--;
        }
        int sum = 0;
        while (left < right) {
            int mn = Math.min(height[left], height[right]);
            if (height[left] == mn) {
                left++;
                while (left < right && height[left] < mn) {
                    sum += mn - height[left++];
                }
            } else {
                right--;
                while (left < right && height[right] < mn) {
                    sum += mn - height[right--];
                }
            }
        }
        return sum;
    }

    public int trapV2(int[] height) {
        // 计算每个位置右边最大值
        int n = height.length;
        int[] maxRight = new int[n];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i + 1]);
        }
        int sum = 0;
        int maxLeft = 0;
        // 计算每个位置的水量（0和n-1的位置无需计算，不会有水）
        for (int i = 1; i < n - 1; i++) {
            maxLeft = Math.max(height[i - 1], maxLeft);
            int min = Math.min(maxLeft, maxRight[i]);
            if (min > height[i]) {
                sum += min - height[i];
            }
        }
        return sum;
    }


}
