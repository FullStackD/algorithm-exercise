package leetcode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

    private List<String> result = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root, new ArrayList<>());
        return result;
    }

    private void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        if (root.left == null && root.right == null) {
            result.add(generateStr(list));
            list.remove(list.size() - 1);
        } else {
            dfs(root.left, list);
            dfs(root.right, list);
            list.remove(list.size() - 1);
        }
    }

    private String generateStr(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append("->");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
