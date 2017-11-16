import java.util.*;

/**
 * 508. Most Frequent Subtree Sum
 *
 * @author Monster
 * @date 2017/11/16
 */
public class MostFrequentSubtreeSum {

    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        find(root, map);
        int max = Collections.max(map.values());
        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                res.add(entry.getKey());
            }
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    public int find(TreeNode root, Map<Integer, Integer> map) {
        if (root.left == null && root.right == null) {
            map.put(root.val, map.getOrDefault(root.val, 0) + 1);
            return root.val;
        }
        int left = root.left != null ? find(root.left, map) : 0;
        int right = root.right != null ? find(root.right, map) : 0;
        int sum = root.val + left + right;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        return sum;
    }

}
