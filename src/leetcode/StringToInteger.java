package leetcode;

/**
 * 8. 字符串转换整数 (atoi)(#)
 */
public class StringToInteger {

    public int myAtoi(String str) {
        int n = str.length();
        int i = 0;
        //去除前导空格
        while (i < n && str.charAt(i) == ' ') {
            i++;
        }
        //只有空格的字符串
        if (i == n) {
            return 0;
        }
        boolean negative = false;
        if (str.charAt(i) == '-') {
            i++;
            negative = true;
        } else if (str.charAt(i) == '+') {
            i++;
        } else if (!Character.isDigit(str.charAt(i))) {//首个非空格字符非数字
            return 0;
        }
        int ans = 0;
        while (i < n && Character.isDigit(str.charAt(i))) {
            int digit = str.charAt(i) - '0';
            //防止越界   ans = ans * 10 +digit
            if (ans > (Integer.MAX_VALUE - digit) / 10) {
                return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }
        return negative ? -ans : ans;
    }


}
