package leetcode;

public class MergeSortedArray {


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right = m + n - 1;
        int i = m - 1, j = n - 1;
        while (right >= 0 && j >= 0 && i >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[right--] = nums1[i--];
            } else {
                nums1[right--] = nums2[j--];
            }
        }
        while (right >= 0 && j >= 0) {
            nums1[right--] = nums2[j--];
        }
    }

}
