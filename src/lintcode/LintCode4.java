package lintcode;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * 4 · 丑数 II
 */
public class LintCode4 {


    /**
     * @param n: An integer
     * @return: return a  integer as description.
     */
    public int nthUglyNumber(int n) {
        int[] factors = {2, 3, 5};
        // 记录已经存储到最小堆中的元素，避免重复存放
        Set<Long> seen = new HashSet<>();
        PriorityQueue<Long> heap = new PriorityQueue<>();
        seen.add(1L);
        heap.offer(1L);
        int unly = 0;
        for (int i = 0; i < n; i++) {
            Long curr = heap.poll();
            unly = curr.intValue();
            for (int factor : factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return unly;
    }

}
