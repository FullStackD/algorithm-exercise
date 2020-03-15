package leetcode;

/**
 * 695. 岛屿的最大面积
 * DFS解法
 */
public class MaxAreaofIsland {

    //上下左右
    private int[] row = {-1, 1, 0, 0};
    private int[] col = {0, 0, -1, 1};

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    max = Math.max(max, dfs(grid, i, j));
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0) {
            return 0;
        }
        int ans = 1;
        grid[i][j] = 0;//不需要另设flag数组，因为元素不会重复使用
        for (int k = 0; k < 4; k++) {
            ans += dfs(grid, i + row[k], j + col[k]);
        }
        return ans;
    }

}
