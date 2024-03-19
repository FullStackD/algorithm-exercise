package leetcode;


/**
 * 114. 二叉树展开为链表
 */
public class LeetCode114 {

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.left);
        flatten(root.right);

        // 展开后的单链表是先序遍历，所以保存的left和right就是头结点
        TreeNode left = root.left;
        TreeNode right = root.right;

        // 左子树指向null
        root.left = null;
        root.right = left;

        // 找到加上左子树后，链表的最右下的节点
        TreeNode rightMost = root;
        while (rightMost.right != null) {
            rightMost = rightMost.right;
        }
        rightMost.right = right;
    }


}
