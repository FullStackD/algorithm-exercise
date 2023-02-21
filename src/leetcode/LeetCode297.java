package leetcode;

import leetcode.common.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class LeetCode297 {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "null,";
        }
        return String.valueOf(root.val) + ',' +
                serialize(root.left) +
                serialize(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(",");
        List<String> dataList = new LinkedList<>(Arrays.asList(arr));
        return deserialize(dataList);
    }

    private TreeNode deserialize(List<String> data) {
        String dataVal = data.get(0);
        data.remove(0);
        if (dataVal.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode();
        root.val = Integer.parseInt(dataVal);
        root.left = deserialize(data);
        root.right = deserialize(data);
        return root;
    }

}
