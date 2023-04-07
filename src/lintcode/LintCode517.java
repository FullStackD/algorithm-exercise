package lintcode;

/**
 * 517 · 丑数
 */
public class LintCode517 {

    /**
     * @param num: An integer
     * @return: true if num is an ugly number or false
     */
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num / 3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }

}
