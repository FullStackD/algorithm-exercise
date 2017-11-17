import java.util.Arrays;

/**
 * 462. Minimum Moves to Equal Array Elements II
 *
 * @author Monster
 * @date 2017/11/17
 */
public class MinimumMovestoEqualArrayElementsII {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums.length / 2;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == mid) {
                continue;
            }
            count += Math.abs(nums[mid] - nums[i]);
        }
        return count;
    }

}
