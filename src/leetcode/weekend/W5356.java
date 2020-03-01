package leetcode.weekend;


public class W5356 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        if (root.val == head.val && head.next == null) {
            return true;
        }
        if (root.val == head.val) {
            if (isSubPath2(head, root)) {
                return true;
            }
        }
        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    private boolean isSubPath2(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        if (root.val == head.val && head.next == null) {
            return true;
        }
        if (root.val == head.val) {
            boolean ls = isSubPath2(head.next, root.left);
            if (ls) {
                return true;
            }
            boolean rs = isSubPath2(head.next, root.right);
            if (rs) {
                return true;
            }
        }
        return false;
    }
}
