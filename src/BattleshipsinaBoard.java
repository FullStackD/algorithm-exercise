/**
 * 419. Battleships in a Board
 *
 * @author Monster
 * @date 2017/11/10
 */
public class BattleshipsinaBoard {

    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (i == 0) {
                    if (j > 0) {
                        if (board[i][j] == 'X' && board[i][j - 1] != 'X') {
                            count++;
                        }
                    } else {
                        if (board[i][j] == 'X') {
                            count++;
                        }
                    }
                } else {
                    if (j > 0) {
                        if (board[i][j] == 'X' && board[i][j - 1] != 'X' && board[i - 1][j] != 'X') {
                            count++;
                        }
                    } else {
                        if (board[i][j] == 'X' && board[i - 1][j] != 'X') {
                            count++;
                        }
                    }

                }
            }
        }
        return count;
    }

}
