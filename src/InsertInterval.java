import java.util.LinkedList;
import java.util.List;

/**
 * 57. Insert Interval
 *
 * @author Monster
 * @date 2017/12/13
 */
public class InsertInterval {

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new LinkedList<>();
        int i = 0;
        //添加在newInterval之前的
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i++));
        }
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval = new Interval(Math.min(newInterval.start, intervals.get(i).start),
                    Math.max(newInterval.end, intervals.get(i).end));
            i++;
        }
        result.add(newInterval);
        //添加在newInterval之后的
        while (i < intervals.size()) {
            result.add(intervals.get(i++));
        }
        return result;
    }


}
