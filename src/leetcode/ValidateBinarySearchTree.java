package leetcode;

/**
 * 98. 验证二叉搜索树
 */
public class ValidateBinarySearchTree {

    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long min, long max) {
        if (root == null) {
            return true;
        }
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }

}
