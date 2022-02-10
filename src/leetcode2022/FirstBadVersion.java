package leetcode2022;

/**
 * 278. 第一个错误的版本
 */
public class FirstBadVersion {


    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isBadVersion(int version) {
        // mock function result
        return true;
    }

}
