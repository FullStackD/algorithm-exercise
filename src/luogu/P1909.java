package luogu;

import java.util.Scanner;

public class P1909 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();
        int min = Integer.MAX_VALUE;//最少需要花费的钱
        for (int i = 0; i < 3; i++) {
            int num1 = cin.nextInt();
            int price = cin.nextInt();
            int t = num / num1 * price;
            if (num % num1 != 0) {
                t += price;
            }
            if (t < min) {
                min = t;
            }

        }
        System.out.println(min);
    }

}
