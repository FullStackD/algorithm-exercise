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
        // 记录中序遍历结点的下标
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, length - 1,
                inorder, 0, length - 1);
    }

    private TreeNode buildTree(int[] preorder, int pStart, int pEnd,
                               int[] inorder, int iStart, int iEnd) {
        if (pStart > pEnd) {
            return null;
        }

        int rootVal = preorder[pStart];
        int rootInIndex = indexMap.get(rootVal);
        int leftSize = rootInIndex - iStart;

        TreeNode root = new TreeNode(rootVal);
        root.left = buildTree(preorder, pStart + 1, pStart + leftSize,
                inorder, iStart, rootInIndex - 1);
        root.right = buildTree(preorder, pStart + leftSize + 1, pEnd,
                inorder, rootInIndex + 1, iEnd);
        return root;
    }


}
