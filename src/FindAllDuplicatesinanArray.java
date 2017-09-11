import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if (nums[val] < 0) {
                ret.add(Math.abs(val + 1));
            }
            nums[val] = -nums[val];
        }
        return ret;
    }

}
