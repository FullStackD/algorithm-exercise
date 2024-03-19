package leetcode;

/**
 * 236. 二叉树的最近公共祖先
 */
public class LeetCode236 {


    /**
     * 在根结点中搜索
     * 1. p q都能找到 返回最近公共祖先
     * 2. p q 找到一个，返回p或者q
     * 3. 都没找到 返回null
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        if (l != null && r != null) {
            return root;
        }
        return l != null ? l : r;
    }


}
