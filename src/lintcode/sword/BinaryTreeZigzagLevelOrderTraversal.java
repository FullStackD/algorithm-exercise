package lintcode.sword;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 71. Binary Tree Zigzag Level Order Traversal
 *
 * @author Monster
 * @date 2018/2/26
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    /**
     * @param root: A Tree
     * @return: A list of lists of integer include the zigzag level order traversal of its nodes' values.
     */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<TreeNode> tmp = new ArrayList<>();
        tmp.add(root);
        int i = 1;
        while (!tmp.isEmpty()) {
            LinkedList<Integer> list = new LinkedList<>();
            LinkedList<TreeNode> t = new LinkedList<>();
            for (TreeNode node : tmp) {
                if (i % 2 == 1) {
                    list.addLast(node.val);
                } else {
                    list.addFirst(node.val);
                }
                if (node.left != null) {
                    t.add(node.left);
                }
                if (node.right != null) {
                    t.add(node.right);
                }
            }
            tmp = t;
            result.add(list);
            i++;
        }
        return result;
    }

}
