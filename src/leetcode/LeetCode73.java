package leetcode;

/**
 * 73. 矩阵置零
 */
public class LeetCode73 {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean shouldFillFirstRow = false;
        boolean shouldFillFirstCol = false;
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) {
                shouldFillFirstRow = true;
                break;
            }
        }
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) {
                shouldFillFirstCol = true;
                break;
            }
        }
        // 存储信息在第一列和第一行
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        // 用第一列和第一行存储的信息在其他列/行填充0
        for (int i = 1; i < m; ++i) {
            for (int j = 1; j < n; ++j) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // 第一行填充0
        if (shouldFillFirstRow)
            for (int j = 0; j < n; ++j)
                matrix[0][j] = 0;
        // 第一列填充0
        if (shouldFillFirstCol)
            for (int i = 0; i < m; ++i)
                matrix[i][0] = 0;
    }

}
