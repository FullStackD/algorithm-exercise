package leetcode;

/**
 * 200. 岛屿数量
 */
public class LeetCode200 {

    public int numIslands(char[][] grid) {
        int ans = 0;
        boolean[][] used = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (dfs(grid, used, i, j)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private boolean dfs(char[][] grid, boolean[][] used, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) {
            return false;
        }

        if (used[i][j] || grid[i][j] == '0') {
            return false;
        }
        used[i][j] = true;
        dfs(grid, used, i + 1, j);
        dfs(grid, used, i - 1, j);
        dfs(grid, used, i, j + 1);
        dfs(grid, used, i, j - 1);
        return true;
    }

}
