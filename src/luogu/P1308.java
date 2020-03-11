package luogu;

import java.util.Scanner;

public class P1308 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String word = cin.nextLine().toLowerCase();
        String article = cin.nextLine().toLowerCase();

        int n = 0;//出现总数
        int firstIndex = 0;
        boolean flag = false;
        int fromIndex = 0;
        int q = article.indexOf(word, fromIndex);
        while (q != -1) {
            q = article.indexOf(word, fromIndex);
            if (q != -1
                    && (q == 0 || article.charAt(q - 1) == ' ')
                    && (q + word.length() < article.length() && article.charAt(q + word.length()) == ' ')) {
                n++;
                if (!flag) {
                    flag = true;
                    firstIndex = q;
                }
            }
            fromIndex = q + word.length();
        }
        if (flag) {
            System.out.printf("%d %d\n", n, firstIndex);
        } else {
            System.out.println(-1);
        }
    }

}
