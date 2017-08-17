import java.util.ArrayList;

/**
 * Created by Admin on 2017/8/18 0018.
 */
public class BinaryTreePreorderTraversal {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        result.add(root.val);
        ArrayList<Integer> leftList = preorderTraversal(root.left);
        result.addAll(leftList);
        ArrayList<Integer> rightList = preorderTraversal(root.right);
        result.addAll(rightList);
        return result;
    }

    //TODO 添加非递归方案
}
