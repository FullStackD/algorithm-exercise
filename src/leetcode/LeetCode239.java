package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 239. 滑动窗口最大值
 */
public class LeetCode239 {

    public int[] maxSlidingWindow(int[] nums, int k) {
        // 异常参数校验
        if (nums.length < k) {
            return new int[0];
        }
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> slidingWindowMaxSum = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.removeFirst();
            }
            // 从左到右，如果遇到比当前值小的，则移除
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
            // 窗口内最大值(第一个窗口范围是[0, k-1]
            if (i >= k - 1) {
                slidingWindowMaxSum.add(nums[deque.peekFirst()]);
            }
        }
        return slidingWindowMaxSum.stream().mapToInt(Integer::intValue).toArray();
    }

}
