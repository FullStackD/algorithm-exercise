package leetcode;

/**
 * 110. 平衡二叉树
 */
public class LeetCode110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int ll = height(root.left);
        int rl = height(root.right);
        if (Math.abs(ll - rl) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    /**
     * 求树的高度
     *
     * @param root
     * @return
     */
    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;
    }

}
