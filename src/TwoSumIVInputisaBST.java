import java.util.ArrayList;
import java.util.List;

public class TwoSumIVInputisaBST {

    public boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        LDR(root.left, list);
        list.add(root.val);
        LDR(root.right, list);
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
            if (list.get(i) + list.get(j) < k) {
                i++;
            } else if (list.get(i) + list.get(j) > k) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }

    private void LDR(TreeNode root, List<Integer> list) {
        if (root == null) return;
        LDR(root.left, list);
        list.add(root.val);
        LDR(root.right, list);
    }

}
