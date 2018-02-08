package leetcode;

/**
 * Author: Admin
 * Date: 2017/11/24 0024.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        if (height.length < 2) {
            return 0;
        }
        int i = 0, j = height.length - 1;
        int max = 0;
        while (i < j) {
            if (height[i] >= height[j]) {
                max = Math.max(max, height[j] * (j - i));
                j--;
            } else {
                max = Math.max(max, height[i] * (j - i));
                i++;
            }
        }
        return max;
    }

}
