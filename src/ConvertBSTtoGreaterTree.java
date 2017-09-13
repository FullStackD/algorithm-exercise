import java.util.ArrayList;
import java.util.List;

public class ConvertBSTtoGreaterTree {

    public TreeNode convertBST(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return root;
        List<TreeNode> list = new ArrayList<>();
        LDR(root, list);
        int sum = list.get(list.size() - 1).val;
        for (int i = list.size() - 2; i >= 0; i--) {
            sum += list.get(i).val;
            list.get(i).val = sum;
        }
        return root;
    }

    public void LDR(TreeNode root, List<TreeNode> list) {
        if (root == null) return;
        LDR(root.left, list);
        list.add(root);
        LDR(root.right, list);
    }

}
