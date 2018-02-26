package lintcode.sword;

import leetcode.ListNode;

/**
 * 112. Remove Duplicates from Sorted List
 *
 * @author Monster
 * @date 2018/2/26
 */
public class RemoveDuplicatesfromSortedList {

    /**
     * @param head: head is the head of the linked list
     * @return: head of linked list
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = head;
        while (tmp != null && tmp.next != null) {
            if (tmp.next.val == tmp.val) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }

        }
        return head;
    }

}
