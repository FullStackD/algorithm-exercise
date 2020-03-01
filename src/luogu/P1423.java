package luogu;

import java.util.Scanner;

public class P1423 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double a = cin.nextDouble();
        double s = 0, step = 2d;
        int n = 0;
        while (s < a) {
            s += step;
            n++;
            step = step * 0.98;
        }
        System.out.println(n);
    }

}
