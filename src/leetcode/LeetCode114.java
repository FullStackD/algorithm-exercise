package leetcode;

/**
 * 114. 二叉树展开为链表
 */
public class LeetCode114 {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode leftResult = flattenTree(root.left);
        TreeNode rightResult = flattenTree(root.right);
        if (leftResult != null) {
            root.right = leftResult;
            while (leftResult.right != null) {
                leftResult = leftResult.right;
            }
            leftResult.right = rightResult;
        } else {
            root.left = null;
            root.right = rightResult;
        }
    }

    private TreeNode flattenTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode leftResult = flattenTree(root.left);
        TreeNode rightResult = flattenTree(root.right);
        if (leftResult != null) {
            root.right = leftResult;
            while (leftResult.right != null) {
                leftResult = leftResult.right;
            }
            leftResult.right = rightResult;
        } else {
            root.right = rightResult;
        }
        return root;
    }

}
