package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 57. 插入区间
 */
public class LeetCode57 {


    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();
        int i = 0;
        // 处理不重叠的区间
        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i++]);
        }
        // 重叠区间合并
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        // 剩余区间
        result.add(newInterval);
        while (i < intervals.length) {
            result.add(intervals[i++]);
        }
        return result.toArray(new int[0][]);
    }

}
