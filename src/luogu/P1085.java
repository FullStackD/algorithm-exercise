package luogu;

import java.util.Scanner;

public class P1085 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < 7; i++) {
            int a = cin.nextInt();
            int b = cin.nextInt();
            int sum = a + b;
            if (sum > 8) {
                if (sum > max) {
                    max = sum;
                    result = i + 1;
                }
            }
        }
        System.out.println(result);
    }

}
