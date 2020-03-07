package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题57 - II. 和为s的连续正数序列
 */
public class SumSequence {

    //滑动窗口算法
    public int[][] findContinuousSequence(int target) {
        int i = 1;
        int j = 1;
        int sum = 0;
        List<int[]> res = new ArrayList<>();

        while (i <= target / 2) {//起始数字不会超过target/2
            if (sum > target) {//左边界向右移动
                sum -= i;
                i++;
            } else if (sum < target) {//右边界向右移动
                sum += j;
                j++;
            } else {
                int[] arr = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
                sum -= i;
                i++;//左边界移动 继续寻找其他解
            }
        }
        return res.toArray(new int[res.size()][]);
    }


}
