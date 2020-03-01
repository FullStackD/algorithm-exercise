package leetcode.weekend;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class W5344 {

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        smallerNumbersThanCurrent(nums);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], n);
            n++;
        }
        int[] res = new int[nums.length];
        for (int i = 0; i < copy.length; i++) {
            res[i] = map.get(copy[i]);
        }
        return res;
    }

}
