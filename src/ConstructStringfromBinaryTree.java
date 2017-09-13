public class ConstructStringfromBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public String tree2str(TreeNode t) {
        String result = "";
        if (t != null) {
            if (t.left == null && t.right == null) {
                return String.valueOf(t.val);
            } else if (t.left != null && t.right == null) {
                result += t.val + "(" + tree2str(t.left) + ")";
            } else if (t.left == null && t.right != null) {
                result += t.val + "()(" + tree2str(t.right) + ")";
            } else {
                result += t.val + "(" + tree2str(t.left) + ")" + "(" + tree2str(t.right) + ")";
            }
        }
        return result;
    }
}
