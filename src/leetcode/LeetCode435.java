package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 435. 无重叠区间
 */
public class LeetCode435 {

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        // 按照每个区间的结束位置进行排序
        Arrays.sort(intervals, Comparator.comparing(a -> a[1]));
        // 已选集合中至少有一个区间
        int count = 1;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            // 如果当前区间的开始位置大于或等于end，则表示当前区间和已选集合中的最后一个区间不重叠，
            // 可以将其加入集合中，并更新end为当前区间的结束位置
            if (intervals[i][0] >= end) {
                count++;
                end = intervals[i][1];
            }
        }
        return intervals.length - count;
    }

}
