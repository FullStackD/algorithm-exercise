public class MinimumDepthOfBinaryTree {

    public int run(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return find(root);
    }

    private int find(TreeNode node) {
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

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}