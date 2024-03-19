package leetcode;

/**
 * 108. 将有序数组转换为二叉搜索树
 */
public class LeetCode108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (mid < low || mid > high) {
            return null;
        }
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, low, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, high);
        return root;
    }

}
