package leetcode;

/**
 * 160. 相交链表
 */
public class IntersectionofTwoLinkedLists {


    /**
     * 先求出长度差i，长链表的指针先移动i位，然后同时移动两个链表的指针，找到首个相同元素结点就是相交的起始结点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int ALen = getLen(headA);
        int BLen = getLen(headB);
        int i = Math.abs(ALen - BLen);
        ListNode tmpA = headA;
        ListNode tmpB = headB;
        if (ALen > BLen) {
            while (i != 0) {
                tmpA = tmpA.next;
                i--;
            }
        } else {
            while (i != 0) {
                tmpB = tmpB.next;
                i--;
            }
        }
        while (tmpA != null) {
            if (tmpA.val == tmpB.val) {
                return tmpA;
            }
            tmpA = tmpA.next;
            tmpB = tmpB.next;
        }
        return null;
    }

    private int getLen(ListNode headB) {
        ListNode tmp = headB;
        int len = 0;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        return len;
    }

    /**
     * 将A、B链表变为A+B和B+A再遍历，找到首个相同元素结点就是相交的起始结点
     */
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }

}
