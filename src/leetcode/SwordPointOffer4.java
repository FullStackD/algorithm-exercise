package leetcode;

/**
 * 剑指 Offer 04. 二维数组中的查找
 */
public class SwordPointOffer4 {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }

    public boolean findNumberIn2DArrayV2(int[][] matrix, int target) {
        int i = matrix.length - 1;
        int j = 0;
        // 从左下角的数字开始搜索
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] > target) {
                // 这一行的最小值都比target大，这一行可以放弃
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }

}
