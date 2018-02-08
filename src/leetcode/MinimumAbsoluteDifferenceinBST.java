package leetcode;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDifferenceinBST {

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        LDR(root, list);
        int a = list.get(0);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            int tmp = Math.abs(a - list.get(i));
            if (tmp < min) {
                min = tmp;
            }
            a = list.get(i);
        }
        return min;
    }

    private void LDR(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        LDR(root.left, list);
        list.add(root.val);
        LDR(root.right, list);
    }
}
