package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 60. 第k个排列
 */
public class PermutationSequence {


    public String getPermutation(int n, int k) {
        int[] factorials = new int[n + 1];
        factorials[0] = 1;
        List<Integer> nums = new ArrayList<>(n);
        //计算1~n的阶乘
        for (int i = 1; i <= n; i++) {
            nums.add(i);
            factorials[i] = factorials[i - 1] * i;
        }
        StringBuilder sb = new StringBuilder();
        k--;
        for (int i = n - 1; i >= 0; i--) {
            int index = k / factorials[i];
            sb.append(nums.remove(index));
            k -= index * factorials[i];
        }
        return sb.toString();
    }


}
