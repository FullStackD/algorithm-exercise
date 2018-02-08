package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 513. Find Bottom Left Tree Value
 *
 * @author Monster
 * @date 2017/11/11
 */
public class FindBottomLeftTreeValue {

    public int findBottomLeftValue(TreeNode root) {
        boolean haveChild = false;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        int res;
        while (!queue.isEmpty()) {
            List<TreeNode> list = new ArrayList<>();
            while (!queue.isEmpty()) {
                list.add(queue.poll());
            }
            haveChild = false;
            res = list.get(0).val;
            for (TreeNode node : list) {
                if (node.left != null) {
                    queue.offer(node.left);
                    haveChild = true;
                }
                if (node.right != null) {
                    queue.offer(node.right);
                    haveChild = true;
                }
            }
            if (!haveChild) {
                return res;
            }
        }
        return 0;
    }

}
