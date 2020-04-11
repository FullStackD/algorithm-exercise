package leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * 103. 二叉树的锯齿形层次遍历
 * 思路：把层次遍历改造即可
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null)
            return new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int k = 0;
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> list = new ArrayList<>();
            while (count > 0) {
                TreeNode node = queue.pollFirst();
                if (k % 2 == 0) {
                    list.add(node.val);
                } else {
                    list.add(0, node.val);
                }
                if (node.left != null)
                    queue.offerLast(node.left);
                if (node.right != null)
                    queue.offerLast(node.right);
                count--;
            }
            res.add(list);
            k++;
        }
        return res;
    }

}
