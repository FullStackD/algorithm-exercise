package leetcode;

/**
 * 70. 爬楼梯
 */
public class LeetCode70 {

    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int a = 1;// 上上个台阶的数量
        int b = 1;// 上个台阶的数量
        // a, b, n
        for (int i = 2; i <= n; i++) {
            int tmp = a + b;
            a = b;
            b = tmp;
        }
        return b;
    }


}
