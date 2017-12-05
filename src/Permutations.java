import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 *
 * @author Monster
 * @date 2017/12/5
 */
public class Permutations {

    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return res;
        }
        boolean[] flags = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            flags[i] = true;
            List<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            permute(list, nums, flags);
            flags[i] = false;
            list.clear();
        }
        return res;
    }

    private void permute(List<Integer> list, int[] nums, boolean[] flags) {
        if (list.size() < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                if (flags[i] == false) {
                    list.add(nums[i]);
                    flags[i] = true;
                    permute(list, nums, flags);
                    list.remove(list.size() - 1);
                    flags[i] = false;
                }
            }
        } else {
            res.add(new ArrayList<>(list));
        }
    }

}
