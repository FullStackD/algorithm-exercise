package leetcode2022;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class BinarySearch {

    /**
     * 缺点：内存占用较大
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int low, int high) {
        if (low <= high) {
            // 阻止溢出处理：mid = left + (right-left)/2
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                return search(nums, target, mid + 1, high);
            } else {
                return search(nums, target, low, mid - 1);
            }
        }
        return -1;
    }

    /**
     * @param nums
     * @param target
     * @return
     */
    public int searchV2(int[] nums, int target) {
        if (nums == null) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 5;
        System.out.println(binarySearch.search(nums, target));
    }

}
