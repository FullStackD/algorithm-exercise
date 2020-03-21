package lintcode.sword;

import java.util.Arrays;

/**
 * 面试题40. 最小的k个数
 */
public class LeastNumbers {

    /**
     * 思路：利用快速排序的partition算法
     */
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        //最小的k个数，下标为0~k-1
        return quickSearch(arr, 0, arr.length - 1, k - 1);
    }

    private int[] quickSearch(int[] arr, int begin, int end, int k) {
        int pos = partition(arr, begin, end);
        if (pos == k) {
            return Arrays.copyOf(arr, pos + 1);
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
            while (++i <= end && arr[i] < pivot) {
            }
            while (--j >= begin && arr[j] > pivot) {
            }
            if (i >= j) break;
            int t = arr[j];
            arr[j] = arr[i];
            arr[i] = t;
        }
        arr[begin] = arr[j];
        arr[j] = pivot;
        return j;
    }


}
