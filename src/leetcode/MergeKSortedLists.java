package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Admin on 2017/9/2 0002.
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        PriorityQueue<ListNode> queue = new PriorityQueue<>(new Comparator<ListNode>() {

            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val > o2.val) {
                    return 1;
                }
                if (o1.val < o2.val) {
                    return -1;
                }
                return 0;
            }

        });
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        for (ListNode list : lists) {
            while (list != null) {
                queue.add(list);
                list = list.next;
            }
        }
        while (!queue.isEmpty()) {
            tmp.next = queue.poll();
            tmp = tmp.next;
        }
        tmp.next = null;
        return result.next;
    }

}
