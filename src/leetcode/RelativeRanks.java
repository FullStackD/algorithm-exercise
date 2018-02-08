package leetcode;

import java.util.*;

public class RelativeRanks {

    public String[] findRelativeRanks(int[] nums) {
        int length = nums.length;
        int[] tmpArr = new int[length];
        for (int i = 0; i < length; i++) {
            tmpArr[i] = nums[i];
        }
        Arrays.sort(tmpArr);
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            String rank;
            if (i == length - 1) {
                rank = "Gold Medal";
            } else if (i == length - 2) {
                rank = "Silver Medal";
            } else if (i == length - 3) {
                rank = "Bronze Medal";
            } else {
                rank = String.valueOf(length - i);
            }
            map.put(tmpArr[i], rank);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            list.add(map.get(nums[i]));
        }
        return list.toArray(new String[length]);
    }


}
