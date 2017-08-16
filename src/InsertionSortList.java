public class InsertionSortList {

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) {
            return  head;
        }
        ListNode result = new ListNode(0);
        result.next = insertionSortList(head.next);//后续节点的排序
        ListNode p = result;
        while(p != null && p.next != null && head.val > p.next.val) {
            p = p.next;
        }
        head.next = p.next;
        p.next = head;
        return result.next;
    }

    private ListNode createList(int... s) {
        ListNode listNode = new ListNode(0);
        ListNode p = listNode;
        for (int i : s) {
            ListNode tmp = new ListNode(i);
            p.next = tmp;
            p = p.next;
        }
        return listNode.next;
    }

    public static void main(String[] args) {
        InsertionSortList s = new InsertionSortList();
        ListNode head = s.createList(5, 3, 2, 1, 4);
        head = s.insertionSortList(head);
        s.print(head);
    }

    private void print(ListNode node) {
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
}
