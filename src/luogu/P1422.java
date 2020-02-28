package luogu;

import java.util.Scanner;

public class P1422 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        if (a <= 150) {
            System.out.printf("%.1f\n", a * 0.4463);
        } else if (a <= 400) {
            System.out.printf("%.1f\n", 150 * 0.4463 + (a - 150) * 0.4663);
        } else {
            System.out.printf("%.1f\n", 150 * 0.4463 + 250 * 0.4663 + (a - 400) * 0.5663);
        }
    }

}
