package leetcode;

/**
 * 450. 删除二叉搜索树中的节点
 */
public class LeetCode450 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode minNode = findMin(root.right);
                root.val = minNode.val;
                root.right = deleteNode(root.right, minNode.val);
            }
        } else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }

    /**
     * 查找二叉树中最小的节点
     *
     * @param node
     * @return
     */
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

}
