package leetcode;

/**
 * @author Monster
 * @date 2018/2/8
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }


    public void print() {
        ListNode t = this;
        while (t != null) {
            System.out.print(t.val + " ");
            t = t.next;
        }
        System.out.println();
    }
}