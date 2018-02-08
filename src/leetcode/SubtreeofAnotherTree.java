package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SubtreeofAnotherTree {


    /**
     * t是否是s的子树
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = false;
        queue.add(s);
        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            if (tmp.val == t.val) {
                flag = subTree(tmp, t);
                if (flag) {
                    break;
                }
            }
            if (tmp.left != null) {
                queue.add(tmp.left);
            }
            if (tmp.right != null) {
                queue.add(tmp.right);
            }
        }
        return flag;
    }

    public boolean subTree(TreeNode s, TreeNode t) {
        if (s == null && t != null) {
            return false;
        }
        if (s != null && t == null) {
            return false;
        }
        if (s == null && t == null) {
            return true;
        }
        if (s.val != t.val) {
            return false;
        }
        return subTree(s.left, t.left) && subTree(s.right, t.right);
    }

}
