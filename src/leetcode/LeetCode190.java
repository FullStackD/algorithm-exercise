package leetcode;

/**
 * 190. 颠倒二进制位
 */
public class LeetCode190 {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        return Integer.reverse(n);
    }

    public int reverseBits2(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            // 把n的最低位补到res最后一位
            res = (res << 1) | (n & 1);
            n = n >> 1;
        }
        return res;
    }

    public int reverseBits3(int n) {
        //高16位和低16位交换位置
        n = (n >>> 16) | (n << 16);
        n = ((n & 0xff00ff00) >>> 8) | ((n & 0x00ff00ff) << 8);
        n = ((n & 0xf0f0f0f0) >>> 4) | ((n & 0x0f0f0f0f) << 4);
        // c=1100 3=0011
        n = ((n & 0xcccccccc) >>> 2) | ((n & 0x33333333) << 2);
        // a=1010 5=0101
        n = ((n & 0xaaaaaaaa) >>> 1) | ((n & 0x55555555) << 1);
        return n;
    }

}
