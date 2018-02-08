package leetcode;

/**
 * 50. Pow(x, n)
 *
 * @author Monster
 * @date 2017/12/11
 */
public class Powxn {


    /**
     * 实现pow功能
     * key1：记录结果
     * key2：n溢出的问题
     *
     * @param x
     * @param n
     */
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        int t = n / 2;
        if (n < 0) {
            t = -t;
            x = 1 / x;
        }
        double res = myPow(x, t);
        if (n % 2 == 0) {
            return res * res;
        } else {
            return res * res * x;
        }
    }

}
