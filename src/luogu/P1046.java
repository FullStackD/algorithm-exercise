package luogu;

import java.util.Scanner;

public class P1046 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] height = new int[10];
        for (int i = 0; i < 10; i++) {
            height[i] = cin.nextInt();
        }
        int tall = cin.nextInt();
        int n = 0;
        for (int i = 0; i < 10; i++) {
            if (tall + 30 >= height[i]) {
                n++;
            }
        }
        System.out.println(n);
    }

}
