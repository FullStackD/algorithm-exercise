package leetcode;

/**
 * 79. 单词搜索
 */
public class LeetCode79 {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, new boolean[board.length][board[0].length], i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, boolean[][] used, int i, int j, String word, int start) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || used[i][j]) {
            return false;
        }
        if (board[i][j] != word.charAt(start)) {
            return false;
        }
        if (start == word.length() - 1) {
            return true;
        }

        used[i][j] = true;
        boolean result = dfs(board, used, i + 1, j, word, start + 1) ||
                dfs(board, used, i - 1, j, word, start + 1) ||
                dfs(board, used, i, j - 1, word, start + 1) ||
                dfs(board, used, i, j + 1, word, start + 1);
        used[i][j] = false;
        return result;
    }

}
