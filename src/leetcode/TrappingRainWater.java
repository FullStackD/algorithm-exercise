package leetcode;

/**
 * 42. Trapping Rain Water
 *
 * @author Monster
 * @date 2017/12/8
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        if (height == null || height.length < 3) {
            return 0;
        }
        int left = 0, right = height.length - 1;
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


}
