package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 515. Find Largest Value in Each Tree Row
 *
 * @author Monster
 * @date 2017/11/12
 */
public class FindLargestValueinEachTreeRow {

    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            List<TreeNode> rowList = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode tmp = queue.poll();
                rowList.add(tmp);
                max = Math.max(max, tmp.val);
            }
            res.add(max);
            for (TreeNode node : rowList) {
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return res;
    }

}
