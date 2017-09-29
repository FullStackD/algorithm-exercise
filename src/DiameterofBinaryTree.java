public class DiameterofBinaryTree {

    private int longest = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getLongestPath(root);
        return --longest;
    }

    private int getLongestPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getLongestPath(root.left);
        int right = getLongestPath(root.right);
        if (left + right + 1 > longest) {
            longest = left + right + 1;
        }
        return Math.max(left + 1, right + 1);
    }

}
