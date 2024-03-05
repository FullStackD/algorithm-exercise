package leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
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
        Deque<TreeNode> stack = new LinkedList<>();
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
