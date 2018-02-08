package leetcode;

public class NumberComplement {

    public int findComplement(int num) {
        // ~num 按位取反
        // 例如：101 => 010
        // Integer.highestOneBit(num)
        // 例如：101 => 100 => 011
        return ~num & (Integer.highestOneBit(num) - 1);
    }

}
