import java.util.*;

/**
 * 18. 4Sum
 *
 * @author Monster
 * @date 2018/1/8
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        //使用Set对List去重
        Set<List<Integer>> result = new HashSet<>();
        for (int j = 0; j < nums.length - 3; j++) {
            for (int i = j + 1; i < nums.length - 2; i++) {
                int low = i + 1, high = nums.length - 1;
                int sum = target - nums[i] - nums[j];
                while (low < high) {
                    if (nums[low] + nums[high] == sum) {
                        result.add(Arrays.asList(nums[j], nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1]) {
                            low++;
                        }
                        while (low < high && nums[high] == nums[high - 1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] > sum) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

}
