package luogu;

import java.util.Scanner;

/**
 * (#)
 */
public class P1036 {

    private static int[] nums;

    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int k = cin.nextInt();
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = cin.nextInt();
        }
        System.out.println(chooseNum(k, 0, 0, n - 1));

    }

    /**
     * @param leftNum 还有leftNum个数待选取
     * @param sum     当前累积和
     * @param start   待选取数字的范围起始
     * @param end     待选取数字的范围结束
     * @return 素数的个数
     */
    private static int chooseNum(int leftNum, int sum, int start, int end) {
        if (leftNum == 0) {
            if (isPrime(sum)) {
                return 1;
            }
        }
        int primesSum = 0;
        for (int i = start; i <= end; i++) {
            primesSum += chooseNum(leftNum - 1, sum + nums[i], i + 1, end);
        }
        return primesSum;
    }

    /**
     * 判断是否为素数
     */
    private static boolean isPrime(int num) {
        //两个较小数另外处理
        if (num == 2 || num == 3) {
            return true;
        }

        //不在6的倍数两侧的一定不是素数
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }

        int tmp = (int) Math.sqrt(num);//获取平方根
        //在6的倍数两侧的也可能不是素数
        for (int i = 5; i <= tmp; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
