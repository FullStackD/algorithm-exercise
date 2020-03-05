package leetcode;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * 994. Rotting Oranges
 */
public class RottingOranges {

    private int[] dr = new int[]{-1, 0, 1, 0};//行
    private int[] dc = new int[]{0, -1, 0, 1};//列

    //使用多源广度优先搜索（队列）
    public int orangesRotting(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;

        Queue<Integer> queue = new ArrayDeque<>();
        Map<Integer, Integer> depth = new HashMap<>();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (grid[r][c] == 2) {
                    int code = r * C + c;
                    queue.add(code);
                    depth.put(code, 0);
                }
            }
        }
        int ans = 0;
        while (!queue.isEmpty()) {
            int code = queue.remove();
            int r = code / C, c = code % C;
            //处理坏橘子周边的好橘子
            for (int k = 0; k < 4; ++k) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (0 <= nr && nr < R && 0 <= nc && nc < C && grid[nr][nc] == 1) {
                    grid[nr][nc] = 2;
                    int ncode = nr * C + nc;
                    queue.add(ncode);
                    depth.put(ncode, depth.get(code) + 1);
                    ans = depth.get(ncode);//BFS深度即最小分钟数
                }
            }
        }
        //检查网格是否依然存在新鲜橘子
        for (int[] row : grid) {
            for (int v : row)
                if (v == 1)
                    return -1;
        }
        return ans;
    }


}
