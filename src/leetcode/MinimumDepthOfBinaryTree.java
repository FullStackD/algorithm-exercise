package leetcode;

/**
 * 111. Minimum Depth of Binary Tree
 *
 * @author Monster
 * @date 2017/10/24
 */
public class MinimumDepthOfBinaryTree {

    private int find(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right != null) {
            return find(node.right) + 1;
        }
        if (node.left != null && node.right == null) {
            return find(node.left) + 1;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        int leftNum = find(node.left);
        int rightNum = find(node.right);
        int minDepth = leftNum > rightNum ? rightNum : leftNum;
        return minDepth + 1;
    }

}

