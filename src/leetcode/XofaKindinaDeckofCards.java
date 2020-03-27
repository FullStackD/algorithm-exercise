package leetcode;

/**
 * 914. 卡牌分组
 * 思路：统计各个数字的数量，求最大公约数，若最大公约数大于2，则返回true
 */
public class XofaKindinaDeckofCards {

    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length == 1) {
            return false;
        }
        int[] count = new int[10001];
        for (int value : deck) {
            count[value]++;
        }
        int j = 0;
        while (j < 10001 && count[j] == 0) {
            j++;
        }
        int k = count[j];
        for (int i = j + 1; i < 10001; i++) {
            if (count[i] != 0) {
                k = gcd(k, count[i]);
            }
        }
        //最大公约数大于2 return true
        return k >= 2;
    }

    //辗转相除法
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
