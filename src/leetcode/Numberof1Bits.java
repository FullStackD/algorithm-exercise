package leetcode;

/**
 * 191. Number of 1 Bits
 *
 * @author Monster
 * @date 10/27/2017
 */
public class Numberof1Bits {

    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) != 0) {
                result++;
            }
            n >>>= 1;
        }
        return result;
    }

}

