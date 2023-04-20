package leetcode;


import java.util.HashMap;
import java.util.Map;

/**
 * 105. 从前序与中序遍历序列构造二叉树
 */
public class LeetCode105 {

    private Map<Integer, Integer> indexMap;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        indexMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, length - 1, 0);
    }

    private TreeNode buildTree(int[] preorder, int preorderLeft, int preorderRight, int inorderLeft) {
        if (preorderLeft > preorderRight) {
            return null;
        }

        // 中序遍历中根节点下标
        int inorderRootIndex = indexMap.get(preorder[preorderLeft]);

        TreeNode root = new TreeNode(preorder[preorderLeft]);
        // 左子树的节点个数
        int leftTreeLength = inorderRootIndex - inorderLeft;

        root.left = buildTree(preorder, preorderLeft + 1, preorderLeft + leftTreeLength,
                inorderLeft);
        root.right = buildTree(preorder, preorderLeft + leftTreeLength + 1, preorderRight,
                inorderRootIndex + 1);
        return root;
    }


}
