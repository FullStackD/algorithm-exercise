package leetcode;

public class GuessNumberHigherorLower {

    public static int guessNumber(int n) {
        int low = 1;
        int high = n;
        if (guess(low) == 0) {
            return low;
        }
        if (guess(high) == 0) {
            return high;
        }
        int res;
        int mid;
        do {
            mid = low + (high - low) / 2;
            res = guess(mid);
            switch (res) {
                case 1:
                    low = mid;
                    break;
                case -1:
                    high = mid;
                    break;
                default:
            }
        } while (res != 0);
        return mid;
    }

    /**
     * @param num
     * @return if target < num return -1
     * if target > num return 1
     */
    private static int guess(int num) {
        if (2 < num) {
            return -1;
        }
        if (num < 2) {
            return 1;
        }
        return 0;
    }

}
