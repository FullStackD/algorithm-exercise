package leetcode;

public class SortList {

    public ListNode sortList(ListNode head) {
        //1. 处理异常数据  Null/一个节点
        if (head == null || head.next == null) {
            return head;
        }
        //2. 找到链表的中间点
        ListNode p = head;//慢指针
        ListNode q = head;//快指针
        while (q.next != null && q.next.next != null) {
            p = p.next;
            q = q.next.next;
        }
        //3. 左边sortList，右边sortList
        ListNode right = sortList(p.next);
        p.next = null;
        ListNode left = sortList(head);
        //4. merge函数
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        ListNode result = new ListNode(0);
        ListNode p = result;
        while (left != null && right != null) {
            if (left.val > right.val) {
                p.next = right;
                right = right.next;
            } else {
                p.next = left;
                left = left.next;
            }
            p = p.next;
        }
        if (left != null) {
            p.next = left;
        }
        if (right != null) {
            p.next = right;
        }
        return result.next;
    }

}
