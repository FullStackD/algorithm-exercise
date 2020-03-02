package leetcode;


/**
 * 206. Reverse Linked List
 *
 * @author Monster
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.print();
        ListNode res = reverseList(head);
        res.print();
    }


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

}
