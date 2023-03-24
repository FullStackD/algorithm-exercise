package leetcode;

import leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 230. 二叉搜索树中第K小的元素
 */
public class LeetCode230 {

    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            k--;
            if (k == 0) {
                break;
            }
            root = root.right;
        }
        return root.val;
    }

}
