package leetcode;

/**
 * 543. 二叉树的直径
 */
public class LeetCode543 {

    private int longest = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxDepth(root);
        return longest - 1;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        longest = Math.max(longest, l + r + 1);
        return Math.max(l, r) + 1;
    }

}
