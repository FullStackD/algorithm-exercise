package leetcode;

/**
 * 695. 岛屿的最大面积
 */
public class LeetCode695 {

    public int maxAreaOfIsland(int[][] grid) {
        int ans = 0;
        boolean[][] used = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int areaNum = dfs(grid, used, i, j);
                if (areaNum > ans) {
                    ans = areaNum;
                }
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, boolean[][] used, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return 0;
        }

        if (used[i][j] || grid[i][j] == 0) {
            return 0;
        }
        used[i][j] = true;
        int result = dfs(grid, used, i + 1, j) +
                dfs(grid, used, i - 1, j) +
                dfs(grid, used, i, j + 1) +
                dfs(grid, used, i, j - 1);
        return 1 + result;
    }

}
