package luogu;

import java.util.Scanner;

public class P1149 {

    //0~9所需的火柴数
    private static int[] sticks = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};


    /**
     * 以下为搜索的解法
     * 也可以提前算出0~2000所需的火柴数
     */
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int res = 0;
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= 1000; j++) {
                if (calNum(i) + calNum(j) + 4 + calNum(i + j) == n) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }

    //计算数字i需要的火柴数
    private static int calNum(int i) {
        if (i < 10) {
            return sticks[i];
        }
        int num = 0;
        for (int j = i; j != 0; j /= 10) {
            num += sticks[j % 10];
        }
        return num;
    }


}
