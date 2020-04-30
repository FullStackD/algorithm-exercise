package leetcode;

/**
 * 231. Power of Two
 */
public class PowerofTwo {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        //如果n为2的幂次，二进制中只有1个1
        return (n & (n - 1)) == 0;
    }

}
