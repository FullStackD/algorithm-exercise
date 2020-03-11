package luogu;

import java.util.Scanner;

public class P1200 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String star = cin.next();
        String q = cin.next();
        int a = 1;
        int b = 1;
        for (int i = 0; i < star.length(); i++) {
            a *= star.charAt(i) - 'A' + 1;//注意要+1
        }
        for (int i = 0; i < q.length(); i++) {
            b *= q.charAt(i) - 'A' + 1;
        }
        if (a % 47 == b % 47) {
            System.out.println("GO");
        } else {
            System.out.println("STAY");
        }
    }

}
