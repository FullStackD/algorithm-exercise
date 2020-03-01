package luogu;

public class P1008 {

    public static void main(String[] args) {
        for (int i = 123; i < 333; i++) {
            if (checkDiff(i, 2 * i, 3 * i)) {
                System.out.printf("%d %d %d\n", i, 2 * i, 3 * i);
            }
        }
    }

    private static boolean checkDiff(int a, int b, int c) {
        StringBuilder sb = new StringBuilder().append(a).append(b).append(c);
        if (sb.indexOf("0") != -1) {
            return false;
        }
        int[] bool = new int[10];
        for (int i = 0; i < 9; i++) {
            if (bool[sb.charAt(i) - '0'] == 1) {
                return false;
            } else {
                bool[sb.charAt(i) - '0'] = 1;
            }
        }
        return true;
    }
}
