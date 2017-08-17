import java.util.ArrayList;


/**
 * Created by Admin on 2017/8/18 0018.
 */
public class BinaryTreePostorderTraversal {


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        ArrayList<Integer> leftList = postorderTraversal(root.left);
        result.addAll(leftList);
        ArrayList<Integer> rightList = postorderTraversal(root.right);
        result.addAll(rightList);
        result.add(root.val);
        return result;
    }

    //TODO 添加非递归方案
}
