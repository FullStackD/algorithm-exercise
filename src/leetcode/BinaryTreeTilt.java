package leetcode;

public class BinaryTreeTilt {

    private int result = 0;

    public int findTilt(TreeNode root) {
        postOrder(root);
        return result;
    }

    public int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = postOrder(root.left);
        int rightSum = postOrder(root.right);
        result += Math.abs(leftSum - rightSum);
        return leftSum + rightSum + root.val;
    }

}
