package leetcode;

/**
 * 面试题 10.01. Sorted Merge LCCI
 */
public class SortedMergeLCCI {


    public void merge(int[] A, int m, int[] B, int n) {
        int a = m - 1;
        int b = n - 1;
        int t = m + n - 1;
        while (b >= 0 && a >= 0) {
            if (B[b] > A[a]) {
                A[t] = B[b];
                b--;
                t--;
            } else {
                A[t] = A[a];
                a--;
                t--;
            }
        }
        while (a >= 0) {
            A[t] = A[a];
            a--;
            t--;
        }
        while (b >= 0) {
            A[t] = B[b];
            b--;
            t--;
        }
    }

}
