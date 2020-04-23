package leetcode;

/**
 * 148. 排序链表
 */
public class SortList {


    /**
     * 归并排序链表（递归）
     * O(logn)的空间复杂度
     * O(nlogn)的时间复杂度
     */
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

    //合并两个有序链表
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

    /**
     * 归并排序（从底至顶直接合并）
     */
    public ListNode sortList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int len = listNodeLength(head);

        ListNode res = new ListNode(-1);
        res.next = head;

        for (int i = 1; i < len; i *= 2) {
            ListNode prev = res;
            ListNode curr = res.next;

            while (curr != null) {
                //找到两个待合并链表
                ListNode left = curr;
                ListNode right = split(left, i);
                curr = split(right, i);//移动到下一个归并段的起始位置
                //与上一个链表连接
                prev.next = merge(left, right);
                //移动到上个链表的尾结点
                while (prev.next != null) {
                    prev = prev.next;
                }
            }
        }
        return res.next;
    }

    private ListNode split(ListNode head, int step) {
        if (head == null) {
            return null;
        }
        for (int i = 1; head.next != null && i < step; i++) {
            head = head.next;
        }
        ListNode right = head.next;
        head.next = null;//断开链表
        return right;
    }

    //求链表长度
    private int listNodeLength(ListNode head) {
        int length = 0;
        ListNode t = head;
        while (t != null) {
            t = t.next;
            length++;
        }
        return length;
    }


}
