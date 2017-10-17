/**
 * 是否存在从根节点到叶子节点的路径和为sum
 *
 * @author Monster
 * @date 2017/10/17
 */
public class PathSum {


    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return dfs(root, sum);
    }

    public boolean dfs(TreeNode root, int sum) {
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                return true;
            } else {
                return false;
            }
        }
        if (root.left != null && root.right != null) {
            return dfs(root.left, sum - root.val) || dfs(root.right, sum - root.val);
        } else if (root.left == null) {
            return dfs(root.right, sum - root.val);
        } else {
            return dfs(root.left, sum - root.val);
        }
    }

}
