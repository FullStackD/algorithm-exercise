
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

    public static void main(String[] args) {
        TeemoAttacking t = new TeemoAttacking();
        int res1 = t.findPoisonedDuration(new int[]{1, 2}, 2);
        System.out.println(res1);
        int res2 = t.findPoisonedDuration(new int[]{1, 4}, 2);
        System.out.println(res2);
    }

}
