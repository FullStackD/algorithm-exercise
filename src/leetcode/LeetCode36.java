package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 36. 有效的数独
 */
public class LeetCode36 {

    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                final char c = board[i][j];
                if (!seen.add((c + "@row" + i)) ||
                        !seen.add(c + "@col" + j) ||
                        !seen.add(c + "@box" + i / 3 + j / 3)) {
                    return false;
                }
            }
        }
        return true;
    }

}
