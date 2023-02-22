package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 39. Combination Sum
 *
 * @author Monster
 * @date 2017/12/4
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(ans, new ArrayList<>(), nums, target, 0);
        return ans;
    }

    /**
     * @param ans      最终结果
     * @param tempList 临时List
     * @param nums     给定的无重复元素数组
     * @param remain   目标数
     * @param start    起始索引
     */
    private void backtrack(List<List<Integer>> ans, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain == 0) {
            ans.add(new ArrayList<>(tempList));
        }
        for (int i = start; i < nums.length; i++) {
            if (nums[i] > remain) {
                return;
            }
            tempList.add(nums[i]);
            // not i + 1 because we can reuse same elements
            backtrack(ans, tempList, nums, remain - nums[i], i);
            tempList.remove(tempList.size() - 1);
        }
    }

}
