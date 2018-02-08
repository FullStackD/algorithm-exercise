package leetcode;

public class TrimaBinarySearchTree {

    /**
     * Input:
     * 3
     * /  \
     * 0    4
     * \
     * 2
     * /
     * 1
     * <p>
     * L = 1
     * R = 3
     */
    public TreeNode trimBST(TreeNode root, int L, int R) {
        TreeNode head = FindHead(root, L, R);
        DFS(head, L, R);
        return head;
    }

    private TreeNode FindHead(TreeNode root, int lower, int upper) {
        if (root == null) {
            return null;
        }
        if (lower <= root.val && root.val <= upper) {
            return root;
        } else {
            if (root.val < lower) {
                return FindHead(root.right, lower, upper);
            } else {
                return FindHead(root.left, lower, upper);
            }
        }
    }

    private TreeNode DFS(TreeNode root, int lower, int upper) {
        if (root == null) {
            return null;
        }
        TreeNode newHead = root;
        if (lower > root.val || root.val > upper) {
            newHead = FindHead(root, lower, upper);
        }
        if (newHead == null) {
            return null;
        }
        if (newHead.left != null) {
            if (newHead.left.val < lower) {
                newHead.left = DFS(newHead.left.right, lower, upper);
            } else {
                newHead.left = DFS(newHead.left, lower, upper);
            }
        }
        if (newHead.right != null) {
            if (newHead.right.val > upper) {
                newHead.right = DFS(newHead.right.left, lower, upper);
            } else {
                newHead.right = DFS(newHead.right, lower, upper);
            }
        }
        return newHead;
    }

}
