package leetcode;

import leetcode.common.TreeNode;

/**
 * 124. 二叉树中的最大路径和
 */
public class LeetCode124 {

    private int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxRootPathSum(root);
        return result;
    }

    /**
     * 从根节点出发的Max Path（左子树/右子树）
     *
     * @param root
     * @return
     */
    public int maxRootPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftRootMax = maxRootPathSum(root.left);
        int rightRootMax = maxRootPathSum(root.right);

        //从leftRootMax+rootVal，rightRootMax+rootVal和rootVal中取最大值，尝试更新result
        int leftMax = Math.max(leftRootMax, 0);
        int rightMax = Math.max(rightRootMax, 0);
        result = Math.max(result, root.val + leftMax + rightMax);

        // return MaxRootPath(rootVal+leftMax or rootVal+rightMax or rootVal)
        return root.val + Math.max(leftMax, rightMax);
    }
}
