package leetcode;

/**
 * 面试题22. 链表中倒数第k个节点
 */
public class KthNodeFromEndofListLCCI {

    public int kthToLast(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        while (k > 0) {
            fast = fast.next;
            k--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.val;
    }

}
