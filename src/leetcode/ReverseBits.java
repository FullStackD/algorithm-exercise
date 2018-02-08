package leetcode;

/**
 * 190. Reverse Bits
 *
 * @author Monster
 * @date 10/27/2017
 */
public class ReverseBits {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;
            if (i < 31) {
                result <<= 1;
            }
        }
        return result;
    }

}
