package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 */
public class LeetCode94 {

    /**
     * 递归实现
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversalv1(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.addAll(inorderTraversalv1(root.left));
        result.add(root.val);
        result.addAll(inorderTraversalv1(root.right));
        return result;
    }

    /**
     * 非递归实现
     *
     * @param root
     * @return
     */
    public List<Integer> inorderTraversalv2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }

}
