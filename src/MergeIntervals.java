import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 56. Merge Intervals
 *
 * @author Monster
 * @date 2017/12/12
 */
public class MergeIntervals {

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

    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        Collections.sort(intervals, Comparator.comparingInt(o -> o.start));
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

}
