package leetcode;


import leetcode.common.ListNode;

/**
 * 206. 反转链表
 */
public class LeetCode206 {


    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = new ListNode(0);//头结点
        while (head != null) {
            ListNode t = res.next;
            res.next = new ListNode(head.val);
            res.next.next = t;
            head = head.next;
        }
        return res.next;
    }

    /**
     * 递归解法
     *
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseList(head.next);
        // 经过reverseList，head.next是最后一个节点
        // 反转链表的最后一个节点指向head
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
