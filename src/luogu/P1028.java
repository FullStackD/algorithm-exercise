package luogu;

import java.util.Scanner;

public class P1028 {

    private static int[] count = new int[1000];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(process(n));
    }

    private static int process(int n) {
        if (n == 1) {
            return 1;
        }
        int num = 1;
        for (int i = 1; i <= n / 2; i++) {
            if (count[i] == 0) {
                count[i] = process(i);
            }
            num += count[i];
        }
        return num;
    }

}
