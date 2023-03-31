package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 47. 全排列 II
 */
public class LeetCode47 {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums); // 对数组进行排序
        boolean[] used = new boolean[nums.length]; // 记录数字是否被使用过
        backtrack(nums, used, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int[] nums, boolean[] used, List<Integer> curr, List<List<Integer>> res) {
        // 如果当前排列的长度等于数组长度，说明已经排列完毕
        if (curr.size() == nums.length) {
            // 将当前排列加入结果集
            res.add(new ArrayList<>(curr));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue; // 如果数字已经被使用过，跳过
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue; // 如果当前数字和前一个数字相同，并且前一个数字没有被使用过，跳过
            }
            used[i] = true; // 标记数字已经被使用
            curr.add(nums[i]); // 将数字加入当前排列
            backtrack(nums, used, curr, res); // 继续递归排列下一个数字
            used[i] = false; // 回溯，将数字标记为未使用
            curr.remove(curr.size() - 1); // 回溯，将数字从当前排列中移除
        }
    }

}
