package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets
 *
 * @author Monster
 * @date 2018/1/5
 */
public class Subsets {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        result.add(new ArrayList<>());
        subsets(0, nums, new ArrayList<>());
        return result;
    }

    public void subsets(int start, int[] nums, List<Integer> list) {
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            result.add(new ArrayList<>(list));
            subsets(i + 1, nums, list);
            list.remove(list.size() - 1);
        }
    }

}
