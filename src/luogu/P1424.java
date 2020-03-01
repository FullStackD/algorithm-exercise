package luogu;

import java.util.Scanner;

public class P1424 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x = cin.nextInt(), n = cin.nextInt();
        int day = 0;
        if (x < 6) {
            day += 6 - x;
        }
        n -= (7 - x + 1);
        day += n / 7 * 5;
        if (n % 7 < 6) {
            day += n % 7;
        } else {
            day += 5;
        }
        System.out.println(day * 250);
    }

}
