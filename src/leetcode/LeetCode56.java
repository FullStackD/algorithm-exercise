package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * 56. 合并区间
 */
public class LeetCode56 {


    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return intervals;
        }
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int n = intervals.length;
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            while (i < n - 1 && intervals[i + 1][0] <= end) {
                end = Math.max(end, intervals[i + 1][1]);
                i++;
            }
            list.add(new int[]{start, end});
        }
        return list.toArray(new int[list.size()][2]);
    }

}
