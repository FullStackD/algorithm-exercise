package leetcode;

/**
 * 413. Arithmetic Slices
 *
 * @author Monster
 * @date 2017/11/15
 */
public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {
        int count = 0;
        for (int i = 0; i + 2 < A.length; i++) {
            int j = i + 2;
            while (j < A.length && isArithmetic(A, i, j)) {
                count++;
                j++;
            }
        }
        return count;
    }

    private boolean isArithmetic(int[] A, int i, int j) {
        for (i = i + 1; i <= j - 1; i++) {
            if (!(A[i + 1] - A[i] == A[i] - A[i - 1])) {
                return false;
            }
        }
        return true;
    }

}
