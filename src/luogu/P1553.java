package luogu;

import java.util.Scanner;

public class P1553 {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.next();
        String res;
        if (str.length() == 1) {
            System.out.println(str);
            return;
        } else if (str.indexOf('.') != -1) {
            if (str.length() == 3) {
                res = str;
            } else {
                String[] array = str.split("\\.");
                res = reverse(array[0]) + "." + reverse2(array[1]);
            }
        } else if (str.indexOf('/') != -1) {
            if (str.length() == 3) {
                res = str;
            } else {
                String[] array = str.split("/");
                res = reverse(array[0]) + "/" + reverse(array[1]);
            }
        } else if (str.indexOf('%') != -1) {
            if (str.length() == 2) {
                res = str;
            } else {
                String[] array = str.split("%");
                res = reverse(array[0]) + "%";
            }
        } else {
            res = reverse(str);
        }
        System.out.println(res);
    }

    private static String reverse(String str) {
        if (str.length() == 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = str.length() - 1;
        while (str.charAt(i) == '0') {
            i--;
        }
        while (i >= 0) {
            sb.append(str.charAt(i));
            i--;
        }
        return sb.toString();
    }

    //小数部分
    private static String reverse2(String str) {
        if (str.length() == 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (str.charAt(i) == '0') {
            i++;
        }
        int j = str.length() - 1;
        while (j >= i) {
            sb.append(str.charAt(j));
            j--;
        }
        return sb.toString();
    }
}
