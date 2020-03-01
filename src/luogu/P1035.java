package luogu;

import java.util.Scanner;

public class P1035 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        double sn = 0;
        double n = 1;
        boolean flag = true;
        while (flag) {
            sn = sn + 1 / n;
            if (sn > k) {//判断要放在n++之前
                System.out.println((int) n);
                flag = false;
            }
            n++;
        }
    }

}
