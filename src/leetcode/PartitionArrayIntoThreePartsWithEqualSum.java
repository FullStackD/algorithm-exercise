package leetcode;

/**
 * 1013. 将数组分成和相等的三个部分
 */
public class PartitionArrayIntoThreePartsWithEqualSum {

    /**
     * 1. 求和mod3判断是否可以分为3部分
     * 2. 双指针寻找是否存在左右部分等于avg
     * <p>
     * 注意：边界的处理 i+1<j
     */
    public boolean canThreePartsEqualSum(int[] A) {
        int n = A.length;
        int sum = sum(0, n, A);
        if (sum % 3 != 0) {
            return false;
        }
        int avg = sum / 3;
        int i = 0, j = n - 1;
        int leftSum = A[i], rightSum = A[j];
        while (i + 1 < j) {
            if (leftSum != avg) {
                leftSum += A[++i];
            }
            if (rightSum != avg) {
                rightSum += A[--j];
            }
            if (leftSum == avg && avg == rightSum && i + 1 < j) {
                return true;
            }
        }
        return false;
    }

    private int sum(int i, int j, int[] A) {
        int sum = 0;
        for (; i < j; i++) {
            sum += A[i];
        }
        return sum;
    }

}
