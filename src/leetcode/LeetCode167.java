package leetcode;

/**
 * 167. 两数之和 II - 输入有序数组
 */
public class LeetCode167 {

    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int n = numbers.length - 1;
        while (i < n) {
            if (numbers[i] + numbers[n] > target) {
                n--;
            } else if (numbers[i] + numbers[n] < target) {
                i++;
            } else {
                return new int[]{i + 1, n + 1};
            }
        }
        return new int[]{};
    }

}
