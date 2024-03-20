package leetcode;

/**
 * 64. 最小路径和
 */
public class LeetCode64 {

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                arr[0][i] = grid[0][0];
            } else {
                arr[0][i] = arr[0][i - 1] + grid[0][i];
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    arr[i][j] = arr[i - 1][j] + grid[i][j];
                } else {
                    arr[i][j] = Math.min(arr[i - 1][j], arr[i][j - 1]) + grid[i][j];
                }
            }
        }
        return arr[m - 1][n - 1];
    }

}
