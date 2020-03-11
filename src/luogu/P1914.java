package luogu;

import java.util.Scanner;

public class P1914 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        String str = cin.next();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) + n <= 'z') {
                System.out.print((char) (str.charAt(i) + n));
            } else {
                System.out.print((char) (str.charAt(i) + n - 26));
            }
        }
    }

}
