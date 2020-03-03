package luogu;

import java.util.Scanner;

public class P1047 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int L = cin.nextInt();
        int M = cin.nextInt();
        int[] start = new int[M];
        int[] end = new int[M];
        for (int i = 0; i < M; i++) {
            start[i] = cin.nextInt();
            end[i] = cin.nextInt();
        }
        sort(start, end);
        int n = 0;
        for (int i = 0; i < M; i++) {
            int a = start[i];//起始点
            int b = end[i];
            for (int j = i + 1; j < M; j++) {
                if (start[j] < b) {
                    b = Math.max(end[j], b);//更新结束点
                    i++;
                } else {
                    break;
                }
            }
            n += b - a + 1;
        }
        System.out.println(L + 1 - n);
    }

    private static void sort(int[] start, int[] end) {
        for (int i = 0; i < start.length; i++) {
            for (int j = i + 1; j < end.length; j++) {
                if (start[i] > start[j]) {
                    swap(start, end, i, j);
                }
            }
        }
    }

    private static void swap(int[] start, int[] end, int i, int j) {
        int a = start[i];
        int b = end[i];
        start[i] = start[j];
        end[i] = end[j];
        start[j] = a;
        end[j] = b;
    }

}
