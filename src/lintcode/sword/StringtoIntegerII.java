package lintcode.sword;

/**
 * 54. String to Integer II
 *
 * @author Monster
 * @date 2018/2/24
 */
public class StringtoIntegerII {

    /**
     * @param str: A string
     * @return: An integer
     */
    public int atoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        str = str.trim();
        char flag = '+';
        int i = 0;
        if (str.charAt(0) == '+') {
            i++;
        }
        if (str.charAt(0) == '-') {
            i++;
            flag = '-';
        }
        double res = 0;
        while (i < str.length() && str.charAt(i) <= '9' && str.charAt(i) >= '0') {
            res = res * 10 + str.charAt(i) - '0';
            i++;
        }
        if (flag == '-') {
            res = -res;
        }
        if (res > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (res < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) res;
    }


}
