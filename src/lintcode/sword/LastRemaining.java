package lintcode.sword;

import java.util.ArrayList;

/**
 * 面试题62. 圆圈中最后剩下的数字(#)
 * <p>
 * 搬一个链接：https://blog.csdn.net/u011500062/article/details/72855826
 */
public class LastRemaining {

    //模拟
    public int lastRemaining(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = 0;
        while (n > 1) {
            index = (index + m - 1) % n;
            list.remove(index);
            n--;
        }
        return list.get(0);
    }

    //数学解法
    public int lastRemaining2(int n, int m) {
        int ans = 0;//最后一次的位置
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}
