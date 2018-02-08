package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class PathSumIII {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int res = 0;
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            res += isPathSum(tmp, sum);
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }
        return res;
    }

    public int isPathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        if (root.val == sum) {
            return 1 + isPathSum(root.left, sum - root.val) + isPathSum(root.right, sum - root.val);
        }
        return isPathSum(root.left, sum - root.val) + isPathSum(root.right, sum - root.val);
    }
}
