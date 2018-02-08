package leetcode;

public class ArrangingCoins {

    public int arrangeCoins(int n) {
        // (1 + row) * row/2 <= n
        int start = 0;
        int end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if ((0.5 * mid * mid + 0.5 * mid) <= n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start - 1;
    }

    /**
     * Another solution
     * (int)((-1 + Math.sqrt(1 + 8 * (long)n)) / 2);
     */
}
