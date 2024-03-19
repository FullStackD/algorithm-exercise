package leetcode;

/**
 * 437. 路径总和 III
 */
public class LeetCode437 {

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        return dfs(root, targetSum) +
                pathSum(root.left, targetSum) +
                pathSum(root.right, targetSum);
    }

    /**
     * 以root为开始结点，所有路径和为targetSum的个数
     *
     * @param root
     * @param sum
     * @return
     */
    private int dfs(TreeNode root, long sum) {
        if (root == null) {
            return 0;
        }
        return (root.val == sum ? 1 : 0)
                + dfs(root.left, sum - root.val)
                + dfs(root.right, sum - root.val);
    }

}
