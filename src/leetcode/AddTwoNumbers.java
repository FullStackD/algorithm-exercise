package leetcode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode tmp = result;
        int num = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + num;
            ListNode numNode = new ListNode(sum % 10);
            num = sum / 10;
            tmp.next = numNode;
            l1 = l1.next;
            l2 = l2.next;
            tmp = tmp.next;
        }
        while (l1 != null) {
            int sum = l1.val + num;
            ListNode numNode = new ListNode(sum % 10);
            num = sum / 10;
            tmp.next = numNode;
            l1 = l1.next;
            tmp = tmp.next;
        }
        while (l2 != null) {
            int sum = l2.val + num;
            ListNode numNode = new ListNode(sum % 10);
            num = sum / 10;
            tmp.next = numNode;
            l2 = l2.next;
            tmp = tmp.next;
        }
        if (num != 0) {
            ListNode numNode = new ListNode(num);
            tmp.next = numNode;
        }
        return result.next;
    }

}
