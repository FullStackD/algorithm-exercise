package leetcode;

/**
 * 1071. 字符串的最大公因子(#)
 */
public class GreatestCommonDivisorofStrings {


    public String gcdOfStrings(String str1, String str2) {
        //若存在最大公因子，str1+str2==str2+str1为充要条件
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    //最大公约数算法
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
