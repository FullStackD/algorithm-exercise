/**
 * Created by Admin on 2017/10/6 0006.
 */
public class ConvertSortedArraytoBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return convertTree(nums, 0, nums.length - 1);
    }

    private TreeNode convertTree(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        if (mid < low || mid > high) {
            return null;
        }
        TreeNode root = new TreeNode(nums[mid]);
        root.left = convertTree(nums, low, mid - 1);
        root.right = convertTree(nums, mid + 1, high);
        return root;
    }


}
