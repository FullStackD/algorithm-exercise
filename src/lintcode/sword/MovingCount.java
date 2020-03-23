package lintcode.sword;

public class MovingCount {

    private static int[][] flag;
    private static int row, col;

    /**
     * 面试题39. 数组中出现次数超过一半的数字
     */
    public int movingCount(int m, int n, int k) {
        flag = new int[m][n];
        row = m;
        col = n;
        return dfs(flag, 0, 0, k);
    }

    private int dfs(int[][] flag, int i, int j, int k) {
        int sum = 0;
        if (i >= 0 && i < row && j >= 0 && j < col &&
                flag[i][j] == 0 && getSum(i) + getSum(j) <= k) {
            sum++;
            flag[i][j] = 1;
            sum += dfs(flag, i - 1, j, k);
            sum += dfs(flag, i + 1, j, k);
            sum += dfs(flag, i, j - 1, k);
            sum += dfs(flag, i, j + 1, k);
        }
        return sum;
    }


    //求数位之和
    private int getSum(int i) {
        int res = 0;
        while (i > 9) {
            res += i % 10;
            i = i / 10;
        }
        return res + i;
    }


}
