public class SumofSquareNumbers {

    public boolean judgeSquareSum(int c) {
        int sqrt = (int) Math.sqrt(c);
        int lo = 0, hi = sqrt;
        while (lo <= hi) {
            int sum = lo * lo + hi * hi;
            if (sum == c) {
                return true;
            } else {
                if (c > sum) {
                    lo++;
                } else {
                    hi--;
                }
            }
        }
        return false;
    }

}
