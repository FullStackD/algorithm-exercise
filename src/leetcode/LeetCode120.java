package leetcode;

import java.util.List;

/**
 * 120. 三角形最小路径和
 */
public class LeetCode120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] arr = new int[triangle.size()][triangle.size()];
        arr[0][0] = triangle.get(0).get(0);
        if (triangle.size() == 1) {
            return arr[0][0];
        }
        for (int i = 1; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    arr[i][j] = arr[i - 1][j] + triangle.get(i).get(j);
                } else if (j == triangle.get(i).size() - 1) {
                    arr[i][j] = arr[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    arr[i][j] = Math.min(arr[i - 1][j - 1], arr[i - 1][j]) + triangle.get(i).get(j);
                }
            }
        }
        int i = triangle.size() - 1;
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < arr[arr.length - 1].length; j++) {
            min = Math.min(min, arr[i][j]);
        }
        return min;
    }

    /**
     * 自底向上
     *
     * @param triangle
     * @return
     */
    public int minimumTotal2(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];
    }

}
