package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 1162. 地图分析
 * 思路：求所有 海洋和距离它最近的陆地的距离 的最大值
 */
public class AsFarfromLandasPossible {

    public int maxDistance(int[][] grid) {
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};

        Queue<int[]> queue = new ArrayDeque<>();
        //把所有陆地入队
        int m = grid.length, n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        //没有陆地
        if (queue.isEmpty()) {
            return -1;
        }
        boolean ocean = false;
        int[] point = null;
        //把所有陆地当成一个整体，BFS
        while (!queue.isEmpty()) {
            point = queue.poll();
            int x = point[0], y = point[1];
            for (int i = 0; i < 4; i++) {
                int newX = x + dx[i];
                int newY = y + dy[i];
                if (newX < 0 || newX >= m || newY < 0 || newY >= n || grid[newX][newY] != 0) {
                    continue;
                }
                grid[newX][newY] = grid[x][y] + 1;
                ocean = true;
                queue.offer(new int[]{newX, newY});
            }
        }
        //没有海洋
        if (!ocean) {
            return -1;
        }
        return grid[point[0]][point[1]] - 1;
    }

}
