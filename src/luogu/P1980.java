package luogu;

import java.util.Scanner;

public class P1980 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt(), x = cin.nextInt();
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += count(i, x);
        }
        System.out.println(res);
    }

    private static int count(int num, int x) {
        String s = num + "";
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) - '0' == x) {
                res++;
            }
        }
        return res;
    }

}
