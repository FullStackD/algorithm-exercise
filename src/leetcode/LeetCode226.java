package leetcode;

import leetcode.common.TreeNode;

/**
 * 226. 翻转二叉树
 */
public class LeetCode226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode preLeft = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(preLeft);
        return root;
    }

}

