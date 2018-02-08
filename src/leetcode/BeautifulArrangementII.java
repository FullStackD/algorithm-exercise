package leetcode;

/**
 * 667. Beautiful Arrangement II
 *
 * @author Monster
 * @date 2017/11/20
 */
public class BeautifulArrangementII {

    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        for (int i = 0, l = 1, r = n; l <= r; i++) {
            if (k > 1) {
                res[i] = k % 2 != 0 ? l++ : r--;
                k--;
            } else {
                res[i] = l++;
            }
        }
        return res;
    }

}
