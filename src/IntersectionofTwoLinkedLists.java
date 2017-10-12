
public class IntersectionofTwoLinkedLists {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

    }

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
