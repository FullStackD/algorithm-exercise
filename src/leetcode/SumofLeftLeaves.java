package leetcode;

import java.util.Stack;

public class SumofLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        if (root == null) {
            return sum;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode tmp = stack.pop();
            if (tmp.left != null && tmp.left.left == null && tmp.left.right == null) {
                sum += tmp.left.val;
            }
            if (tmp.left != null) {
                stack.push(tmp.left);
            }
            if (tmp.right != null) {
                stack.push(tmp.right);
            }
        }
        return sum;
    }

}
