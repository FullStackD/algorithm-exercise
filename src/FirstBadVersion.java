/**
 * 278. First Bad Version
 *
 * @author Monster
 * @date 2017/10/25
 */
public class FirstBadVersion {


    private boolean isBadVersion(int version) {
        int FIRST_BAD_VERSION = 1702766719;
        if (version < FIRST_BAD_VERSION) {
            return false;
        }
        return true;
    }

    public int firstBadVersion(int n) {
        int low = 1;
        while (low < n) {
            int mid = low + (n - low) / 2;
            if (isBadVersion(mid)) {
                n = mid;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

}
