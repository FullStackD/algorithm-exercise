package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 253. 会议室 II
 */
public class LeetCode253 {

    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // 存储会议的结束时间
        Queue<Integer> minHeap = new PriorityQueue<>();

        for (int[] interval : intervals) {
            // 如果堆顶结束时间小于当前会议开始时间表示该会议室可以被重用
            if (!minHeap.isEmpty() && interval[0] >= minHeap.peek()) {
                minHeap.poll();
            }
            minHeap.offer(interval[1]);
        }

        return minHeap.size();
    }

}
