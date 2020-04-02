package leetcode;

/**
 * 289. 生命游戏(#)
 * 思路1：加入额外的状态（即可表示原来状态，又可表示现在状态）
 * 思路2：使用额外的位保存新的状态。
 */
public class GameOfLife {

    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[] neighbors = {0, 1, -1};
        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {

                int liveNeighbors = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                            int r = row + neighbors[i];
                            int c = col + neighbors[j];
                            //检查未越界且原先是活的
                            if ((r < m && r >= 0) && (c < n && c >= 0) && Math.abs(board[r][c]) == 1) {
                                liveNeighbors++;
                            }
                        }
                    }
                }

                if ((board[row][col] == 1) && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    // -1 代表这个细胞过去是活的现在死了
                    board[row][col] = -1;
                }
                if (board[row][col] == 0 && liveNeighbors == 3) {
                    // 2 代表这个细胞过去是死的现在活了
                    board[row][col] = 2;
                }

            }
        }
        //更新状态
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] > 0) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }


    }


}
