package luogu;

import java.util.Scanner;

public class P1089 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int sum = 0;//存入的钱
        int rest = 0;//花销完毕，再存完后剩余的钱（小于100）
        int restMoney;//每个月花销完毕剩余的钱
        for (int i = 0; i < 12; i++) {
            int a = cin.nextInt();
            restMoney = 300 + rest - a;
            if (restMoney >= 100) {
                sum += restMoney / 100 * 100;
                rest = restMoney % 100;
            } else if (restMoney < 0) {
                System.out.println(-(i + 1));
                return;
            } else {
                rest = restMoney;
            }
        }
        System.out.println((int) (sum * 1.2) + rest);
    }
}


