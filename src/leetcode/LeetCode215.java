package leetcode;


/**
 * 215. 数组中的第K个最大元素
 */
public class LeetCode215 {

    /**
     * 思路：利用快排的partition算法排序
     * 当pos为nums.length-k时，说明arr[pos]是第K大的元素
     *
     * @param nums
     * @param k
     * @return
     */
    public int findKthLargest(int[] nums, int k) {
        return quickSearch(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSearch(int[] arr, int begin, int end, int k) {
        int pos = partition(arr, begin, end);
        if (pos == k) {
            return arr[k];
        }
        if (pos < k) {
            return quickSearch(arr, pos + 1, end, k);
        } else {
            return quickSearch(arr, begin, pos - 1, k);
        }
    }

    private int partition(int[] arr, int begin, int end) {
        int pivot = arr[begin];
        int i = begin, j = end + 1;
        while (true) {
            //找到第一个比pivot大的元素
            while (++i <= end && arr[i] < pivot) ;
            //找到第一个比pivot小的元素
            while (--j >= begin && arr[j] > pivot) ;
            if (i >= j) {
                break;
            }
            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }
        arr[begin] = arr[j];
        arr[j] = pivot;
        return j;
    }

}
