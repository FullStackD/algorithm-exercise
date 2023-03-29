package leetcode;

import java.util.Arrays;

/**
 * 179. 最大数
 */
public class LeetCode179 {

    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        // 降序排序
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        if (arr[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

}
