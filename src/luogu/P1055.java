package luogu;

import java.util.Scanner;

public class P1055 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        int sum = 0;
        int t = 1;
        for (int i = 0; i < 11; i++) {
            if (str.charAt(i) != '-') {
                sum += t * (str.charAt(i) - '0');
                t++;
            }
        }
        if (sum % 11 == 10 && (str.charAt(12) == 'X')) {
            System.out.println("Right");
        } else if (sum % 11 == (str.charAt(12) - '0')) {
            System.out.println("Right");
        } else {
            if (sum % 11 != 10) {
                System.out.println(str.substring(0, 12) + sum % 11);
            } else {
                System.out.println(str.substring(0, 12) + 'X');
            }
        }
    }
}
