package luogu;

import java.util.Scanner;

public class P1428 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] lovely = new int[n];
        for (int i = 0; i < n; i++) {
            lovely[i] = cin.nextInt();
        }
        System.out.print("0 ");
        for (int i = 1; i < n; i++) {
            int t = 0;
            for (int j = 0; j < i; j++) {
                if (lovely[i] > lovely[j]) {
                    t++;
                }
            }
            System.out.print(t + " ");
        }
    }

}
