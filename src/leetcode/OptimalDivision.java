package leetcode;

/**
 * 553. Optimal Division
 *
 * @author Monster
 * @date 2017/11/12
 */
public class OptimalDivision {

    public String optimalDivision(int[] nums) {
        if (nums.length == 1) {
            return "" + nums[0];
        }
        if (nums.length != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(nums[0]).append("/(");
            int i = 1;
            for (; i < nums.length - 1; i++) {
                sb.append(nums[i]).append("/");
            }
            sb.append(nums[i]).append(")");
            return sb.toString();
        } else {
            return nums[0] + "/" + nums[1] + "";
        }
    }

}
