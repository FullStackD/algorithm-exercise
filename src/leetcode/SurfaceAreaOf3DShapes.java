package leetcode;

/**
 * 892. 三维形体的表面积
 */
public class SurfaceAreaOf3DShapes {

    public int surfaceArea(int[][] grid) {
        int sum = 0;
        //横着扫描
        int i, j;
        for (i = 0; i < grid.length; i++) {
            for (j = 0; j < grid[0].length; j++) {
                if (j == 0) {
                    sum += grid[i][j];
                } else {
                    sum += Math.abs(grid[i][j] - grid[i][j - 1]);
                }
                if (grid[i][j] != 0) {
                    sum += 2;//上方和下方
                }
            }
            sum += grid[i][j - 1];
        }
        //竖着扫描
        for (j = 0; j < grid[0].length; j++) {
            for (i = 0; i < grid.length; i++) {
                if (i == 0) {
                    sum += grid[i][j];
                } else {
                    sum += Math.abs(grid[i][j] - grid[i - 1][j]);
                }
            }
            sum += grid[i - 1][j];
        }
        return sum;
    }

}
