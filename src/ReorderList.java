import java.util.List;

/**
 * Created by Admin on 2017/8/21 0021.
 */
public class ReorderList {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        //找到中间节点
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        //反转后面的
        ListNode node = slow.next;
        if (node != null && node.next != null) {
            ListNode nex = node.next;
            while (nex != null) {
                node.next = nex.next;
                nex.next = slow.next;
                slow.next = nex;
                nex = node.next;
            }
        }
        //链表合并
        merge(head, slow);
    }

    private static void merge(ListNode head, ListNode slow) {
        ListNode left = head;//左边的
        ListNode right = slow.next;//右边的
        while (left != null && right != null) {
            slow.next = right.next;
            right.next = left.next;
            right = slow.next;
            left = right.next.next;
        }
    }

    public static void main(String[] args) {
        ListNode head = createList(1, 5, 3, 4, 2);
        reorderList(head);
        print(head);
    }

    private static ListNode createList(int... s) {
        ListNode listNode = new ListNode(0);
        ListNode p = listNode;
        for (int i : s) {
            ListNode tmp = new ListNode(i);
            p.next = tmp;
            p = p.next;
        }
        return listNode.next;
    }

    private static void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
