package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 90. Subsets II
 *
 * @author Monster
 * @date 2018/1/5
 */
public class SubsetsII {

    private List<List<Integer>> result = new ArrayList<>();

    public void subsets(int start, int[] nums, List<Integer> list) {
        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            subsets(i + 1, nums, list);
            list.remove(list.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        result.add(new ArrayList<>());
        subsets(0, nums, new ArrayList<>());
        return result;
    }

}
