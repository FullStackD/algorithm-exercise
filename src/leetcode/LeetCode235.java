package leetcode;

import leetcode.common.TreeNode;

/**
 * 235. 二叉搜索树的最近公共祖先
 */
public class LeetCode235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int max = Math.max(p.val, q.val);
        int min = Math.min(p.val, q.val);
        while (root != null) {
            if (root.val > max) {
                root = root.left;
            } else if (root.val < min) {
                root = root.right;
            } else {
                return root;
            }
        }
        return null;
    }

}
