package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * 56. 合并区间
 */
public class MergeIntervals {


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

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        intervals.sort(Comparator.comparingInt(o -> o.start));
        int start;
        int end;
        for (int i = 0; i < intervals.size(); i++) {
            start = intervals.get(i).start;
            end = intervals.get(i).end;
            while (i + 1 < intervals.size() && intervals.get(i + 1).start <= end) {
                end = Math.max(end, intervals.get(i + 1).end);
                i++;
            }
            Interval interval = new Interval(start, end);
            res.add(interval);
        }
        return res;
    }

    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

}
