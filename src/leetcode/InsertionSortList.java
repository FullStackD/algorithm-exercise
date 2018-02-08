package leetcode;

public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode result = new ListNode(0);
        result.next = insertionSortList(head.next);//后续节点的排序
        ListNode p = result;
        while (p != null && p.next != null && head.val > p.next.val) {
            p = p.next;
        }
        head.next = p.next;
        p.next = head;
        return result.next;
    }

}
