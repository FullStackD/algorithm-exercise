package luogu;

import java.util.Scanner;

public class P1425 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int d = cin.nextInt();
        int hour = c - a;
        int m;
        if (d < b) {
            m = d + 60 - b;
            hour--;
        } else {
            m = d - b;
        }
        System.out.println(hour + " " + m);

    }

}
