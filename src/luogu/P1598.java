package luogu;

import java.util.Scanner;

public class P1598 {

    private static int[] num = new int[26];

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            String str = cin.nextLine();
            count(str);
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        print(max);
    }

    private static void print(int max) {
        int depth = max;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 26; j++) {
                if (num[j] >= depth) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            depth--;
            System.out.println();
        }
        System.out.println("A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
    }

    private static void count(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                num[c - 'A']++;
            }
        }
    }


}
