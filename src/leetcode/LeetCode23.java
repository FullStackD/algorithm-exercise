package leetcode;

import leetcode.common.ListNode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 23. 合并 K 个升序链表
 */
public class LeetCode23 {

    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> result = Arrays.stream(lists).collect(Collectors.toList());
        do {
            for (int i = 0; i < result.size(); i++) {
                if (i + 1 == lists.length) {
                    result.add(lists[i]);
                } else {
                    result.add(merge(lists[i], lists[i + 1]));
                }
            }
        } while (result.size() > 1);
        return result.get(0);
    }

    private ListNode merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode temp = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if (list1 != null) {
            temp.next = list1;
        }
        if (list2 != null) {
            temp.next = list2;
        }
        return head.next;
    }

}


