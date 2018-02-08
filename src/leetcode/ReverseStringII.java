package leetcode;

/**
 * Created by Admin on 2017/10/1 0001.
 */
public class ReverseStringII {

    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        reverse(arr, 0, k);
        return new String(arr);
    }

    private void reverse(char[] arr, int begin, int k) {
        if (arr.length > begin + 2 * k) {
            for (int i = 0; i < k / 2; i++) {
                swap(arr, begin + i, begin + k - i - 1);
            }
            reverse(arr, begin + 2 * k, k);
        } else if (arr.length > begin + k) {
            for (int i = 0; i < k / 2; i++) {
                swap(arr, begin + i, begin + k - i - 1);
            }
        } else {
            k = arr.length - begin;
            for (int i = 0; i < k / 2; i++) {
                swap(arr, begin + i, begin + k - i - 1);
            }
        }
    }

    private void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
