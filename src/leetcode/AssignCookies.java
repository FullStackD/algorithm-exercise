package leetcode;

import java.util.Arrays;

public class AssignCookies {

    public static int findContentChildren(int[] g, int[] s) {
        int sum = 0;
        int tmp = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        for (int i = 0; i < g.length; i++) {
            for (int j = tmp; j < s.length; j++) {
                if (g[i] <= s[j]) {
                    sum++;
                    tmp = j + 1;
                    break;
                }
            }
        }
        return sum;
    }

}
