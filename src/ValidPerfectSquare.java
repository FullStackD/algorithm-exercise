public class ValidPerfectSquare {


    /**
     * 牛顿法
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare(int num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
    }


    /**
     * 二分法
     *
     * @param num
     * @return
     */
    public boolean isPerfectSquare2(int num) {
        int low = 1;
        int high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;
    }

}
