package leetcode;

import java.util.*;

/**
 * 40. Combination Sum II
 *
 * @author Monster
 * @date 2018/1/12
 */
public class CombinationSumII {

    private Set<List<Integer>> set = new HashSet<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            List tmp = new ArrayList<>(tempList);
            if (!set.contains(tmp)) {
                set.add(tmp);
                list.add(tmp);
            }
        } else {
            for (int i = start; i < nums.length; i++) {
                tempList.add(nums[i]);
                // not i + 1 because we can reuse same elements
                backtrack(list, tempList, nums, remain - nums[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

}
