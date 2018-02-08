package leetcode;

/**
 * 495. Teemo Attacking
 *
 * @author Monster
 * @date 2017/11/20
 */
public class TeemoAttacking {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries == null || timeSeries.length == 0) {
            return 0;
        }
        int result = 0;
        int start = timeSeries[0];
        int end = timeSeries[0] + duration;
        for (int i = 1; i < timeSeries.length; i++) {
            if (timeSeries[i] > end) {
                result += end - start;
                start = timeSeries[i];
            }
            end = timeSeries[i] + duration;
        }
        result += end - start;
        return result;
    }

}
