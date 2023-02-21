package leetcode;


/**
 * 572. 另一棵树的子树
 */
public class LeetCode572 {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null) {
            return false;
        }
        return isSameTree(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean isSameTree(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null || tree1.val != tree2.val) {
            return false;
        }
        return isSameTree(tree1.left, tree2.left) && isSameTree(tree1.right, tree2.right);
    }


}
