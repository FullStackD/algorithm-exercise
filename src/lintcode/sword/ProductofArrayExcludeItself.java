package lintcode.sword;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 50. Product of Array Exclude Itself
 *
 * @author Monster
 * @date 2018/2/26
 */
public class ProductofArrayExcludeItself {

    /**
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public static List<Long> productExcludeItself(List<Integer> nums) {
        long product = 1L;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 0) {
                set.add(i);
            } else {
                product *= nums.get(i);
            }
        }
        List<Long> result = new ArrayList<>(nums.size());
        if (set.size() > 1) {
            for (int i = 0; i < nums.size(); i++) {
                result.add(0L);
            }
            return result;
        }
        if (set.size() == 1) {
            for (int num : nums) {
                if (num == 0) {
                    result.add(product);
                } else {
                    result.add(0L);
                }
            }
            return result;
        }
        for (int num : nums) {
            result.add(product / num);
        }
        return result;
    }

}
