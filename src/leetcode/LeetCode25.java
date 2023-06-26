package leetcode;

import leetcode.common.ListNode;

/**
 * 25. K 个一组翻转链表
 */
public class LeetCode25 {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode tail = head;

        for (int i = 0; i < k; i++) {
            if (tail == null) {
                return head;
            }
            tail = tail.next;
        }
        ListNode newHead = reverse(head, tail);
        head.next = reverseKGroup(tail, k);
        return newHead;
    }

    /**
     * Reverses [head, tail)
     *
     * @param head
     * @param tail
     * @return
     */
    private ListNode reverse(ListNode head, ListNode tail) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != tail) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}
