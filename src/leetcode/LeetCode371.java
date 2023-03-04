package leetcode;

/**
 * 371. 两整数之和
 */
public class LeetCode371 {

    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }

}
